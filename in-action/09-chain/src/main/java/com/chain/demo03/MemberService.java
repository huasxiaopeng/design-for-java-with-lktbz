package com.chain.demo03;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/01
 */
public class MemberService {
    public void login(String loginName,String loginPass){
        Handle validateHandler = new ValidateHandler();
        Handle loginHandler = new LoginHandler();
        Handle authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandle(new Member(loginName,loginPass));

    }
}
