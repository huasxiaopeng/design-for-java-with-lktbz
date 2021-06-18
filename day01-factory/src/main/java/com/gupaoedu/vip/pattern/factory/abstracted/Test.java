package com.gupaoedu.vip.pattern.factory.abstracted;

/**
 * Test：
 *
 * @author: lktbz
 * @date: 2020/4/17 21:40
 */
public class Test {
    public static void main(String[] args) {
        JavaFactory factory=new JavaFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}