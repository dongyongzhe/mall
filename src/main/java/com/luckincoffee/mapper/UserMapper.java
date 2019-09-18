package com.luckincoffee.mapper;

import com.luckincoffee.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 13:50
 * @Description: 用户CRUD
 */
@Mapper
public interface UserMapper {
    /**
     * 根据唯一主键id进行删除操作
     * @param id 用户ID
     * @return 改变的行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入新的用户
     * @param user 用户对象
     * @return 改变的行数
     */
    @Insert("INSERT INTO t_member(name,password) VALUES(#{username},#{password})")
    int insert(User user);

    /**
     * id递减的顺序得到所有的会员集合
     */
    @Select("SELECT * FROM t_member ORDER BY id DESC")
    List<User> list();

    /**
     * 根据姓名查找用户对象
     */
    @Select("SELECT * FROM t_member WHERE name=#{name}")
    User findByName(String name);

    /**
     * 根据用户名和密码查找用户，和登录页面传来的数据一一对应
     */
    @Select("SELECT * FROM t_member WHERE name=#{name} AND password=#{password}")
    User findByUsernameAndPassword(@Param("name") String name, @Param("password") String password);
}
