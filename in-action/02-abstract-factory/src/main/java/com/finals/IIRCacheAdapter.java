package com.finals;

import com.simple.custer.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @Description IIR 集群环境配置
 * @Author lktbz
 * @Date 2021/06/21
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }
}
