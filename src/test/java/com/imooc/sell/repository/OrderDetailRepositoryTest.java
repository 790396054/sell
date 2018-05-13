package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by gmm on 2018/5/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail detail = new OrderDetail();
        detail.setDetailId("123456710");
        detail.setOrderId("11111111");
        detail.setProductId("1");
        detail.setProductIcon("https://fuss10.elemecdn.com/3/ff/5d2e54e5b37aeff84bdf5d0fc2979jpeg.jpeg?imageMogr2/thumbnail/200x200/format/webp/quality/85");
        detail.setProductPrice(new BigDecimal(2.67));
        detail.setProductName("皮皮虾");
        detail.setProductQuantity(1);
        OrderDetail save = repository.save(detail);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> detailList = repository.findByOrderId("11111111");
        Assert.assertNotEquals(0, detailList.size());
    }
}