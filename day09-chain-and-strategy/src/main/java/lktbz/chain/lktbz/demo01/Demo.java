package lktbz.chain.lktbz.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/28
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    private static void  init(){
        //创建server
        server=new Server();
        server.register("admin", "admin");
        server.register("user", "user");
        //构建链式
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());


        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do{
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        }while (!success);


    }

}
