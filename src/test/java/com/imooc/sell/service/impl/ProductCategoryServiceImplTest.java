package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.service.ProductCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by gmm on 2018/5/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryService categoryService;

    @Test
    public void findOne() {
        ProductCategory one = categoryService.findOne(1);
        assertEquals(Integer.valueOf(1), one.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = categoryService.findAll();
        assertNotEquals(0, all.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> types = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2, 3, 4, 5));
        assertNotEquals(0, types.size());
    }

    @Test
    public void save() {
        Random random = new Random(10000);
        ProductCategory save = categoryService.save(new ProductCategory("单元测试添加", random.nextInt()));
        assertNotNull(save);
    }
}