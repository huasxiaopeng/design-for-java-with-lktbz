package com.design;

/**
 * @Description 装饰器类
 * @Author lktbz
 * @Date 2021/06/30
 */
public abstract class CodeDector  extends Coder{
    private Coder coder;

    public CodeDector(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void doCode() {
        coder.doCode();
    }
}
