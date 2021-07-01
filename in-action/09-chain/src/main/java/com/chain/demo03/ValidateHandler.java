package com.chain.demo03;

import org.springframework.util.StringUtils;

/**
 * @Description 校验用户名和密码
 * @Author lktbz
 * @Date 2021/07/01
 */
public class ValidateHandler extends Handle {
    @Override
    public void doHandle(Member member) {
        if(StringUtils.isEmpty(member.getLoginName())||StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码成功,可以往下执行");
        chain.doHandle(member);
    }
}
