package lktbz.chain.lktbz.demo01;

/**
 * @ClassName ThrottlingMiddleware
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/28
 */
/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }
    //todo 实现自己的逻辑
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if(request>requestPerMinute){
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email,password);
    }

}
