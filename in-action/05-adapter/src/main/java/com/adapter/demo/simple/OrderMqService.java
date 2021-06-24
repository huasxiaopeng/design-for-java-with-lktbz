package com.adapter.demo.simple;

import com.adapter.demo.mq.OrderMq;
import com.alibaba.fastjson.JSON;

/**
 * @Description 订单MQ消息处理
 * @Author lktbz
 * @Date 2021/06/24
 */
public class OrderMqService {
    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }
}
