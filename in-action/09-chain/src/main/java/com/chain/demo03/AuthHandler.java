package com.chain.demo03;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/01
 */
public class AuthHandler extends Handle {
    @Override
    public void doHandle(Member member) {
        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");
    }
}
