package com.finals;

import com.simple.custer.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @Description EGM 集群redis 配置
 * @Author lktbz
 * @Date 2021/06/21
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
