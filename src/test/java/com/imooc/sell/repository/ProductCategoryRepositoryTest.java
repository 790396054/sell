package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        Random random = new Random(200000);
        ProductCategory productCategory = new ProductCategory("女生最爱", random.nextInt());
        ProductCategory save = repository.save(productCategory);
        assertNotNull(save);
    }

    @Test
    public void testFind() {
        ProductCategory category = repository.findOne(1);
        assertNotNull(category);
    }

    @Test
    public void testUpdate() {
        Random random = new Random(10000);
        ProductCategory productCategory = repository.findOne(1);
        productCategory.setCategoryType(random.nextInt());
        ProductCategory save = repository.save(productCategory);
        assertNotNull(save);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<ProductCategory> categories = repository.findByCategoryTypeIn(Arrays.asList(2,12));
        assertNotEquals(0, categories.size());
    }
}