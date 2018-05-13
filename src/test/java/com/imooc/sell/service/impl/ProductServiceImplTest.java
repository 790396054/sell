package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商品单元测试
 * Created by gmm on 2018/5/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = productService.findUpAll();
        Assert.assertNotEquals(0, upAll.size());
    }

    @Test
    public void findAll(){
        PageRequest pageRequest = new PageRequest(1 ,2);
        Page<ProductInfo> productInfos = productService.findAll(pageRequest);
        Assert.assertNotEquals(0, productInfos.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(2.67));
        productInfo.setProductStock(20);
        productInfo.setProductDescription("皮皮虾很好吃");
        productInfo.setProductIcon("http:/xxxxx.png");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(1);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
        ProductInfo one = productService.findOne("1");
        Assert.assertNotNull(one);
    }
}