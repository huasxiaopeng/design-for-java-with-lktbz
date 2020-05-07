package com.gupaoedu.vip.pattern.factory.abstracted;

/**
 * PythonVideo：
 *
 * @author: lktbz
 * @date: 2020/4/17 21:33
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制python 视频");
    }
}