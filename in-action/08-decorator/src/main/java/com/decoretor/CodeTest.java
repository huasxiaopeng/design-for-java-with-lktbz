package com.decoretor;

/**
 * @Description 测试类
 * @Author lktbz
 * @Date 2021/06/30
 */
public class CodeTest {
    public static void main(String[] args) {
        Coder coder=new JavaCoder();
        coder.code();
        Coder coder1=new GoCoder();
        coder1.code();
    }
    /**
     *
     *  需求，想让java会go 还想go 也会java
     *  分析： 功能性增强？为什么这么说？都是写代码原来只是一种，现在要求会两种，实际来说就是是code  功能进行增强
     */
}
