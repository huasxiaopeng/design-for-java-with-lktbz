package lktbz.chain.lktbz.demo01;

/**
 * @ClassName RoleCheckMiddleware
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/28
 */
public class RoleCheckMiddleware extends  Middleware{
    public boolean check(String email, String password) {
        if (email.equals("admin")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
