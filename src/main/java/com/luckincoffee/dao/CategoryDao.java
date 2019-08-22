package com.luckincoffee.dao;

import com.luckincoffee.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName: mall
 * @Package: com.luckincoffee.dao
 * @ClassName: CategoryDao
 * @Author: dyz
 * @Description: Jpa操作数据库中category表
 * @Date: 2019/8/22 17:24
 * @Version: 1.0
 */
public interface CategoryDao extends JpaRepository<Category,Integer> {
}
