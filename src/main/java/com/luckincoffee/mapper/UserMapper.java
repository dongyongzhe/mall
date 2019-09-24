package com.luckincoffee.mapper;

import com.luckincoffee.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 13:50
 * @Description: 用户CRUD
 */
@Mapper
public interface UserMapper {

    /**
     * 插入新的用户
     * @param user 用户对象
     * @return 改变的行数
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO t_user(name,password) VALUES(#{username},#{password})")
    int insert(User user);

    /**
     * id递减的顺序得到所有的会员集合
     * @return 用户集合
     */
    @Select("SELECT * FROM t_user ORDER BY id DESC")
    List<User> list();


    /**
     * 根据姓名查找用户对象
     * @param name 用户名
     * @return 查询到的用户对象
     */
    @Select("SELECT * FROM t_user WHERE name=#{name}")
    User findByName(String name);


    /**
     * 根据用户名和密码查找用户，和登录页面传来的数据一一对应
     * @param name 用户名
     * @param password 密码
     * @return 查询到的用户对象
     */
    @Select("SELECT * FROM t_user WHERE name=#{name} AND password=#{password}")
    User findByUsernameAndPassword(@Param("name") String name, @Param("password") String password);

    /**
     * 更新用户
     * @param user 用户对象
     */
    @Update("UPDATE t_user SET name=#{name},password=#{password},salt=#{salt},sex=#{sex},phone=#{phone},avatar=#{avatar},score=#{score},role=#{role},status=#{status} WHERE id=#{id}")
    void update(User user);
}
