package com.adapter.demo.simple;

import com.adapter.demo.mq.CreateAccount;
import com.alibaba.fastjson.JSON;

/**
 * @Description 开户接口消息处理
 * @Author lktbz
 * @Date 2021/06/24
 */
public class CreateAccountMqService {
    public void onMessage(String message) {

        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
