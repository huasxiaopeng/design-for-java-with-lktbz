package com.gupaoedu.vip.pattern.factory.abstracted;

/**
 * JavaNote：
 *
 * @author: lktbz
 * @date: 2020/4/17 21:21
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写java 笔记");
    }
}