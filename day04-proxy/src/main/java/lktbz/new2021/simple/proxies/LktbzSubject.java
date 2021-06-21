package lktbz.new2021.simple.proxies;

import lktbz.new2021.simple.proxies.ISubject;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class LktbzSubject  implements ISubject {
    @Override
    public void eat(String name) {
        System.out.println("小明正在吃东西。。。");
    }
}
