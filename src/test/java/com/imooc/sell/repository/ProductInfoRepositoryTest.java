package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by gmm on 2018/5/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1111");
        productInfo.setProductName("单元测试添加");
        productInfo.setProductPrice(new BigDecimal(2.67));
        productInfo.setProductStock(20);
        productInfo.setProductDescription("测试");
        productInfo.setProductIcon("http:/xxxxx.png");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        ProductInfo save = repository.save(productInfo);
        assertNotNull(save);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> byProductStatus = repository.findByProductStatus(0);
        assertNotEquals(0, byProductStatus.size());
    }
}