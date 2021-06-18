package com.gupaoedu.vip.pattern.factory.abstracted;

/**
 * JavaFactory：
 *
 * @author: lktbz
 * @date: 2020/4/17 21:23
 */
public class JavaFactory extends AbstractFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new com.gupaoedu.vip.pattern.factory.abstracted.JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new com.gupaoedu.vip.pattern.factory.abstracted.JavaVideo();
    }
}