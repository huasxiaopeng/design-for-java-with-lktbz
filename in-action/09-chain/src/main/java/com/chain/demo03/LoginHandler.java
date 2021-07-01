package com.chain.demo03;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/01
 */
public class LoginHandler  extends Handle{
    @Override
    public void doHandle(Member member) {
        System.out.println("登录成功");
        member.setRoleName("管理员");
        chain.doHandle(member);
    }
}
