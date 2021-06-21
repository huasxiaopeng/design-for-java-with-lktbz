package com.simple.use;

import java.util.concurrent.TimeUnit;

/**
 * @Description 简单使用 抽接口出来
 * @Author lktbz
 * @Date 2021/06/21
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
