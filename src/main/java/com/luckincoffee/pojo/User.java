package com.luckincoffee.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: dyz
 * @Description: 会员
 * @Date: 2019/8/22 9:10
 */
@Setter
@Getter
@ToString(exclude = {"password","salt"})
public class User {
    private int id;
    private String name;
    private String password;
    /**
     * 加盐
     */
    private String salt;
}
