package com.gupaoedu.vip.pattern.factory.abstracted;

/**
 * PythonFactory：
 *
 * @author: lktbz
 * @date: 2020/4/17 21:33
 */
public class PythonFactory extends  AbstractFactory {
    @Override
    protected INote createNote() {
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        return new PythonVideo();
    }
}