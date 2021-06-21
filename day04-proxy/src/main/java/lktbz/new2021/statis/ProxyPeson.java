package lktbz.new2021.statis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class ProxyPeson implements InvocationHandler {
    private IPesons peson;
    public IPesons cretaInstance(IPesons peson){
        this.peson=peson;
        Class<? extends IPesons> aClass = peson.getClass();
      return  (IPesons) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我的胃很难受");
        Object invoke = method.invoke(this.peson, args);
        System.out.println("还得执行");
        return invoke;
    }
}
