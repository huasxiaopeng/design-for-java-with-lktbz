package com.design;

import com.decoretor.GoCoder;

/**
 * @Description GO 工作者
 * @Author lktbz
 * @Date 2021/06/30
 */
public class GoCode extends CodeDector {

    public GoCode(Coder coder) {
        super(coder);
    }
    private void codeGo(){
        System.out.println("我会写go");
    }
    @Override
    public void doCode() {
        super.doCode();
        codeGo();
    }
}
