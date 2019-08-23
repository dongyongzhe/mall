package com.luckincoffee.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author: dyz
 * @Description: 商品种类实体类
 * @Date: 2019/8/19 17:30
 */
@Entity
@Table(name = "category")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@Getter
@Setter
public class Category {
    @Id  //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增长方式
    @Column(name = "id")  //属性对应的数据库字段
    private int id;

    private String name;
}
