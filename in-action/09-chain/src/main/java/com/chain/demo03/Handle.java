package com.chain.demo03;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/01
 */
public  abstract class Handle {
    protected  Handle chain;

    /**
     * 构建链方法
     * @param handle
     */
    public void  next(Handle handle){
        this.chain=handle;
    }

    /**
     * 抽象出来的处理类
     * @param member
     */
    public abstract void doHandle(Member member);

}
