package com.inprove;

import java.util.concurrent.TimeUnit;

/**
 * @Description 使用if去匹配方法
 * @Author lktbz
 * @Date 2021/06/21
 */
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
