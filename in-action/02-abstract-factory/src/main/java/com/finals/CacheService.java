package com.finals;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
