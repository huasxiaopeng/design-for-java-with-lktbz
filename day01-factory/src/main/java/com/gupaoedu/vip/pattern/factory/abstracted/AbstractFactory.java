package com.gupaoedu.vip.pattern.factory.abstracted;

/**
 * AbstractFactory：
 *   抽象工厂类
 * @author: lktbz
 * @date: 2020/4/17 21:18
 */
public  abstract class AbstractFactory {
    public void  init(){
     System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}