package com.design;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/30
 */
public class Test {
    public static void main(String[] args) {
        Coder coder=new GoCode(new JavaCode(new ConCoder()));
        coder.doCode();
    }
}
