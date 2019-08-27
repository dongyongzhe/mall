package com.luckincoffee.mapper;

import com.luckincoffee.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 13:50
 * @Description: 用户CRUD
 */
public interface UserMapper {
    /**
     * 根据唯一主键id进行删除操作
     * @param id 用户ID
     * @return 改变的行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入新的用户
     * @param record 用户对象
     * @return 改变的行数
     */
    int insert(User record);

    @Select("SELECT * FROM user ORDER BY id DESC")
    List<User> list();
}
