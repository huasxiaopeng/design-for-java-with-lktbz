package com.chain.demo02;

import com.chain.demo01.AuthInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 进行抽象改造
 * @Author lktbz
 * @Date 2021/07/01
 */
public  abstract  class AuthLink {
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);
    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化
    protected String levelUserId;                           // 级别人员ID
    protected String levelUserName;                         // 级别人员姓名
    private AuthLink next;                                   // 责任链
    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }
    /**
     * 下一个链路
     * @return
     */
    public AuthLink next() {
        return next;
    }
    /**
     *构建链路
     * @param next
     * @return
     */
    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }
    /**
     * 链路处理
     * @param uId
     * @param orderId
     * @param authDate
     * @return
     */
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
