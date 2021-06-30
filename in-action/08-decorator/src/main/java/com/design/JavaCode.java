package com.design;

/**
 * @Description java 工作者
 * @Author lktbz
 * @Date 2021/06/30
 */
public class JavaCode  extends CodeDector{

    public JavaCode(Coder coder) {
        super(coder);
    }

    /**
     * 自己方法
     */
    private void codeJava(){
        System.out.println("java 写代码");
    }
    @Override
    public void doCode() {
        super.doCode();

        codeJava();
    }
}
