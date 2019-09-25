package com.luckincoffee.interceptor;

import com.luckincoffee.pojo.User;
import com.luckincoffee.service.CartService;
import com.luckincoffee.service.CategoryService;
import com.luckincoffee.vo.CartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/25 14:39
 * @Description: 其他拦截器
 */
public class OtherInterceptor implements HandlerInterceptor {
    @Autowired
    private CartService cartService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int cartTotalItemNumber = 0;
        if (null != user) {
            List<CartVo> carts = cartService.getCart(user);
            for (CartVo cart : carts) {
                cartTotalItemNumber += cart.getNumber();
            }
        }
        session.setAttribute("cartTotalItemNumber", cartTotalItemNumber);
        String contextPath=request.getServletContext().getContextPath();
        request.getServletContext().setAttribute("contextPath", contextPath);
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
