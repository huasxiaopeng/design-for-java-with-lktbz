package com.adapter.demo.simple;

import com.adapter.demo.mq.POPOrderDelivered;
import com.alibaba.fastjson.JSON;

/**
 * @Description 第三方消息接受处理
 * @Author lktbz
 * @Date 2021/06/24
 */
public class POPOrderDeliveredService {
    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);
        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }
}
