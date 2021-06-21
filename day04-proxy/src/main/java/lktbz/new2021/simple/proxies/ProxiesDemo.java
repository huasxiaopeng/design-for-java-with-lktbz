package lktbz.new2021.simple.proxies;

/**
 * @Description 测试类
 * @Author lktbz
 * @Date 2021/06/21
 */
public class ProxiesDemo {
    public static void main(String[] args) {
        ProxyISubject proxyISubject=new ProxyISubject(new LktbzSubject());
        proxyISubject.eat("lktbz ");
    }
}
