package com.finals;

import com.simple.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class CacheServiceImpl implements CacheService{
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
