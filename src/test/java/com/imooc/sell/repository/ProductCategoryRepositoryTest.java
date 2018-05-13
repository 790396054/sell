package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by gmm on 2018/5/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional // 测试的事务，执行完毕回滚，不会污染数据表
    public void testAdd(){
        ProductCategory productCategory = new ProductCategory("女生最爱", 3);
        ProductCategory save = repository.save(productCategory);
        assertNotNull(save);
    }

    @Test
    public void testFind() {
        ProductCategory category = repository.findOne(1);
        System.out.println(category);
        assertNotNull(category);
    }

    @Test
    public void testUpdate() {
        ProductCategory productCategory = repository.findOne(1);
        productCategory.setCategoryType(12);
        ProductCategory save = repository.save(productCategory);
        assertNotNull(save);
    }
}