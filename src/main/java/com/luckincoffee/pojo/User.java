package com.luckincoffee.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ProjectName: mall
 * @Package: com.luckincoffee.pojo
 * @ClassName: User
 * @Author: dyz
 * @Description: 会员
 * @Date: 2019/8/22 9:10
 * @Version: 1.0
 */
@Setter
@Getter
@ToString(exclude = {"password","salt"})
public class User {
    private int id;
    private String name;
    private String password;
    private String salt;  //加盐

}
