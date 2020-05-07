package com.gupaoedu.vip.pattern.factory.abstracted;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * PythonNote：
 *
 * @author: lktbz
 * @date: 2020/4/17 21:38
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写python 笔记");
    }
}