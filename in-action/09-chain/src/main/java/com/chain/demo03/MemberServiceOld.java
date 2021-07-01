package com.chain.demo03;

import org.springframework.util.StringUtils;

/**
 * @Description 对登录的信息 进行用户名校验，然后对权限进行校验，校验通过登录成功
 * @Author lktbz
 * @Date 2021/07/01
 */
public class MemberServiceOld {
    //这是传统写法
    public void login(String loginName,String loginPass){
         if(StringUtils.isEmpty(loginName)||StringUtils.isEmpty(loginPass)){
             System.out.println("用户名密码校验失败，不能进行");
             return;
         }
        System.out.println("用户名密码不为空可以往下执行");
        /**
         * 校验
         */
       Member member= checkExist(loginName,loginPass);
       if(null==member){
           System.out.println("用户不存在");
           return;
       }
       if(!"管理员".equals(member.getRoleName())){
           System.out.println("你没有权限操作..");
           return;
       }
        System.out.println(
                "允许操作。。。"
        );
    }

    private Member checkExist(String loginName, String loginPass) {
        Member member=new Member(loginName,loginPass);
        member.setRoleName("管理员");
        return member;
    }

    public static void main(String[] args) {
        MemberServiceOld old=new MemberServiceOld();
        old.login("tom","zs");
//        old.login("","");
    }
}
