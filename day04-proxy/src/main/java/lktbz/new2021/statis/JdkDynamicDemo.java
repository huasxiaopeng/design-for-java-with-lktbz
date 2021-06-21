package lktbz.new2021.statis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description jdk 动态代理实现  simple style
 * @Author lktbz
 * @Date 2021/06/21
 */
public class JdkDynamicDemo {
    public  interface  Simple{
        void  sayHello(String name);
    }
    public static class  DefaultSimple implements Simple{
        @Override
        public void sayHello(String name) {
            System.out.println(String.format("%s say hello!", name));
        }
    }

    /**
     * 实现代理类
     * @param args
     */
    public static void main(String[] args) {
        final Simple simple=new DefaultSimple();
        Object o = Proxy.newProxyInstance(JdkDynamicDemo.class.getClassLoader(),
                new Class[]{Simple.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before say hello...");
                        method.invoke(simple, args);
                        System.out.println("After say hello...");
                        return null;
                    }
                }
        );
            Simple proxy=(Simple)o;
            proxy.sayHello("zs");
    }
}
