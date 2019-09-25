package com.luckincoffee.controller;

import com.luckincoffee.ao.MessageAo;
import com.luckincoffee.enumcase.OrderStatusEnum;
import com.luckincoffee.pojo.*;
import com.luckincoffee.service.*;
import com.luckincoffee.util.Result;
import com.luckincoffee.vo.CartVo;
import com.luckincoffee.vo.CategoryVo;
import com.luckincoffee.vo.OrderVo;
import com.luckincoffee.vo.ProductVo;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: dyz
 * @Date: 2019/9/08 15:31
 * @Description: 前台页面控制器
 */
@RestController
public class ForeController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private CartService cartService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private AddressService addressService;

    /**
     * 首页
     */
    @GetMapping(value = "/forehome")
    public Result home(){
        //获取到所有的类别
        List<CategoryVo> c=categoryService.listAllCategoryVo();
        return Result.success(c);
    }

    /**
     * 注册
     * @param user 前台传入的用户对象
     * @return 结果信息
     */
    @PostMapping(value = "/foreregister")
    public Result register(@RequestBody User user){
        String username=user.getUsername();
        String password=user.getPassword();
        //对前端传来的用户名进行转义处理
        username = HtmlUtils.htmlEscape(username);
        user.setUsername(username);
        if (userService.isExist(username)) {
            String message="用户名已经存在，请重新输入";
            return Result.fail(message);
        }
        user.setPassword(password);
        userService.addUser(user);
        return Result.success();
    }

    /**
     * 登录
     * @param user 登录的用户
     * @param session 作用域
     * @return 结果信息
     */
    @PostMapping(value = "/forelogin")
    public Result login(@RequestBody User user, HttpSession session){
        String username=user.getUsername();
        username=HtmlUtils.htmlEscape(username);
        User user1=userService.findByUsernameAndPassword(username,user.getPassword());
        if(null==user1){
            String message="账户密码错误";
            return Result.fail(message);
        }else{
            //将用户信息存入session作用域中
            session.setAttribute("user",user1);
            return Result.success();
        }
    }

    /**
     * 根据商品Id获取到的商品详情
     * @param pid 商品Id
     * @return 查询到的结果信息
     */
    @GetMapping(value = "/foreproduct/{pid}")
    public Result getProduct(@PathVariable("pid") int pid){
        Product product= productService.getById(pid);
        ProductVo productVo = productService.getProductVo(product);
        return Result.success(productVo);
    }


    /**
     * 前台根据Id获取到该分类下的所有商品信息
     * @param cid 类别Id
     * @return 该分类下的所有商品
     */
    @GetMapping(value = "/forecategory/{cid}")
    public Result showproductsByCategory(@PathVariable int cid){
        Category category = categoryService.getById(cid);
        String categoryName = category.getName();
        //该分类下的所有商品
        List<ProductVo> productVos = categoryService.listProductVo(category);
        //将分类名称以及该分类下的所有商品放入map集合返回
        Map<String, Object> map = new HashMap<>(16);
        map.put("categoryName",categoryName);
        map.put("productVos",productVos);
        return Result.success(map);
    }

    /**
     * 检测用户是否登录
     */
    @GetMapping(value = "/forecheckLogin")
    public Result checkLogin(HttpSession session){
        User user = (User) session.getAttribute("user");
        if (null!=user){
            return Result.success();
        }else {
        return Result.fail("您还未登录");
        }
    }


    /**
     * 搜索
     * @param keywords 搜索关键字
     * @return 返回结果
     */
    @PostMapping("foresearch")
    public Result search( String keywords){
        List<ProductVo> productVos = new ArrayList<>();
        if(null==keywords) {
            keywords = "";
            return Result.success(productVos);
        }else {
            List<Product> products = productService.search(keywords, 0, 20);
            for (Product product : products) {
                ProductVo productVo = productService.getProductVo(product);
                productVos.add(productVo);
            }
            return Result.success(productVos);
        }
    }


    /**
     * 添加购物车
     * @param pid 商品ID
     * @param num 商品数量
     * @param session session 存储的用户对象
     * @return 结果
     */
    @GetMapping(value = "/foreaddCart")
    public Result addCart(int pid,int num,HttpSession session){
        User user = (User) session.getAttribute("user");
        int uid = user.getId();
        Integer cartCount = cartService.getCountByUidAndPid(uid,pid);
        Product product = productService.getById(pid);
        int stock = product.getStock();
        //如果购物车里该商品的数量小于等于库存，就可以继续加入购物车
        if(null!=cartCount&&(num+cartCount)<=stock){
            cartService.addCart(pid,num,user);
            return Result.success("加入成功!");
        }
        else if(null==cartCount||(num+cartCount)<=stock){
            cartService.addCart(pid,num,user);
            return Result.success("加入成功!");
        }
        else if(null!=cartCount&&(num+cartCount)>stock&&cartCount<stock) {
            return Result.fail("添加多了哦>_<",2);
        }
        else{
            return Result.fail("购物车中该商品到上限了哟",1);
        }

    }

    /**
     *展示购物车
     *@param session session存储的用户对象
     *@return 结果
     */
    @GetMapping(value = "/forecart")
    public Result getCart(HttpSession session){
        User user = (User) session.getAttribute("user");
        //包括购物车中的商品名称，图片，价格以及选择的该商品的数量
        List<CartVo> cartVos=cartService.getCart(user);
        return Result.success(cartVos);
    }

    /**
     * 购物车页面修改商品数量
     * @param session 存储的用户对象
     * @param pid 商品Id
     * @param num 修改的数量
     * @return 返回的结果
     */
    @GetMapping(value = "/foreupdatecart")
    public Result updateCart(HttpSession session, int pid, int num) {
        User user = (User) session.getAttribute("user");
        int uid = user.getId();
        if (null == user) {
            return Result.fail("未登录");
        } else {
            cartService.updateCart(uid, pid,num);
            return Result.success();
        }
    }

    /**
     * 删除购物车中的某一商品
     * @param session 存储的用户对象
     * @param pid 商品Id
     * @return 返回给前台的结果
     */
    @GetMapping("foredeletecart")
    public Result deleteCart(HttpSession session,int pid){
        User user =(User)  session.getAttribute("user");
        if(null==user){
            return Result.fail("未登录");
        }else{
            cartService.delete(user.getId(),pid);
            return Result.success();
        }
    }

    /**
     * 结算
     * @param pid 商品Id
     * @param session 存储的用户对象
     * @return
     */
    @GetMapping("forebuy")
    public Result buy(String[] pid,HttpSession session){
        List<CartVo> cartVos = new ArrayList<>();
        User user = (User) session.getAttribute("user");
        for (String ppid : pid) {
            int pppid = Integer.parseInt(ppid);
            CartVo cartVo = cartService.getOne(user.getId(), pppid);
            cartVos.add(cartVo);
        }
        session.setAttribute("carts", cartVos);
        return Result.success(cartVos);
    }


    /**
     * 新建订单
     * @param message 确认订单时填入的信息
     * @param session 存储的用户对象和选中的购物车
     * @return 结果
     */
    @PostMapping("forecreateOrder")
    public Result createOrder(@RequestBody MessageAo message, HttpSession session){
        User user =(User)session.getAttribute("user");
        if(null==user) {
            return Result.fail("未登录");
        }
        //当前时间加4位随机数生成订单编号
        String orderNumber = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + RandomUtils.nextInt(10000);
        Order order = new Order();
        order.setOrderNumber(orderNumber);
        order.setCreateTime(new Date());
        order.setUserId(user.getId());
        order.setUserMessage(message.getUserMessage());
        //设置订单状态为未支付
        order.setStatus(OrderStatusEnum.WAITPAY.getStatus());
        List<CartVo> cartVos= (List<CartVo>) session.getAttribute("carts");
        List<OrderItem> orderItems  = new ArrayList<>();
        for (CartVo cartVo : cartVos) {
            OrderItem orderItem = new OrderItem();
            orderItem.setNumber(cartVo.getNumber());
            orderItem.setUserId(user.getId());
            orderItem.setProductId(cartVo.getProductVo().getProduct().getId());
            orderItems.add(orderItem);
        }
        Address address = new Address();
        address.setDetail(message.getDetail());
        address.setMobile(message.getMobile());
        address.setPost(message.getPost());
        address.setReceiver(message.getReceiver());
        address.setUserId(user.getId());
        addressService.add(address);
        //设置订单地址编号
        order.setAddressId(address.getId());
        //订单中商品总数
        int totalNumber=0;
        for (OrderItem orderItem : orderItems) {
            totalNumber+=orderItem.getNumber();
            //删除已经生成订单的购物车
            cartService.delete(user.getId(),orderItem.getProductId());
        }
        order.setTotalNumber(totalNumber);
        orderService.add(order,orderItems);
        int oid=order.getId();
        return Result.success(oid);
    }

    /**
     * 将订单状态改为已支付
     * @param oid 订单Id
     * @param total 总价
     * @return
     */
    @GetMapping("forepayed")
    public Result payed(int oid,String total) {
        Order order = orderService.getByOrderId(oid);
        order.setStatus(OrderStatusEnum.WAITDELIVERY.getStatus());
        order.setPayDate(new Date());
        order.setTotal(Float.parseFloat(total));
        orderService.update(order);
        return Result.success(order);
    }

    /**
     * 查看订单详情
     * @param session 存储的用户对象
     * @return 查询到的订单
     */
    @GetMapping("forebought")
    public Result bought(HttpSession session) {
        User user =(User)session.getAttribute("user");
        if(null==user) {
            return Result.fail("未登录");
        }else {
            List<OrderVo> orderVos = orderService.listOrderNotDelete(user);
            return Result.success(orderVos);
        }
    }

    @GetMapping("/foreself")
    public Result self(HttpSession session){
        User user =(User)session.getAttribute("user");
        if(null==user) {
            return Result.fail("未登录");
        }else{
            User user1 = userService.getUser(user.getId());
            return Result.success(user);

        }
    }

    /**
     * 用户修改
     * @param session session中存储的用户对象
     * @param user 前台提交的用户
     * @return 结果
     */
    @PostMapping("/foreupdateself")
    public Result updateSelf(HttpSession session,@RequestBody User user){
        User user1 =(User)session.getAttribute("user");
        if(null==user1) {
            return Result.fail("未登录");
        }else{
            userService.updateUser(user);
            return Result.success();
        }
    }

    /**
     * 用户进行订单删除操作（不是真正的删除，只是将状态修改为“删除状态”）
     * @param oid 订单Id
     * @return 返回结果
     */
    @PutMapping("foredeleteOrder")
    public Result deleteOrder(int oid){
        Order order = orderService.getByOrderId(oid);
        //将订单属性设置为"delete"
        order.setStatus(OrderStatusEnum.DELETE.getStatus());
        orderService.update(order);
        return Result.success();
    }

    /**
     * 将订单状态改为待评价
     * @param oid 订单Id
     * @return 返回结果
     */
    @GetMapping("foreorderConfirmed")
    public Result confirmed(int oid) {
        Order order = orderService.getByOrderId(oid);
        order.setStatus(OrderStatusEnum.WAITREVIEW.getStatus());
        order.setConfirmDate(new Date());
        orderService.update(order);
        return Result.success();
    }


}
