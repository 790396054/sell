package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
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
 * Created by gmm on 2018/5/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private static final String OPENID = "12121";

    @Test
    public void saveTest() {
        OrderMaster master = new OrderMaster();
        master.setOrderId("123457");
        master.setBuyerName("慕课网");
        master.setBuyerPhone("18748432143");
        master.setBuyerAddress("呼和浩特市新城区哲里木路");
        master.setBuyerOpenid(OPENID);
        master.setOrderAmount(new BigDecimal(12.6));
        OrderMaster save = repository.save(master);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest pageRequest = new PageRequest(0, 10);
        Page<OrderMaster> orderMasters = repository.findByBuyerOpenid(OPENID, pageRequest);
        Assert.assertNotEquals(0, orderMasters.getTotalElements());
    }
}