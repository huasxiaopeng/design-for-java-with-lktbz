package com.gupaoedu.vip.pattern.factory.abstracted;

/**
 * JavaVideo：
 *
 * @author: lktbz
 * @date: 2020/4/17 21:21
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制java 视频");
    }
}