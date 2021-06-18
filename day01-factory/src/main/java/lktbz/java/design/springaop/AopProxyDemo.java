package lktbz.java.design.springaop;

import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.AopProxyFactory;
import org.springframework.aop.framework.DefaultAopProxyFactory;

/**
 * @ClassName
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */
public class AopProxyDemo {
    public static void main(String[] args) {
        AopProxyFactory aopProxyFactory=new DefaultAopProxyFactory();
        /**
         * 抽象类 AopProxyFactory
         *   抽象方法
         *
         *   AopProxy createAopProxy(AdvisedSupport config) throws AopConfigException;
         *
         *   具体的实现类
         *     DefaultAopProxyFactory
         */
    }
}
