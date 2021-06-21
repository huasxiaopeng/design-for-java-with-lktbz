package lktbz.new2021.simple.proxies;

/**
 * @Description 代理类
 * @Author lktbz
 * @Date 2021/06/21
 */
public class ProxyISubject implements  ISubject {
    private ISubject iSubject;

    public ProxyISubject(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void eat(String name) {
        add01();
        iSubject.eat(name);
        add02();
    }
    public void add01(){
        System.out.println("准备吃饭");
    }
    public void add02(){
        System.out.println("结账");
    }
}
