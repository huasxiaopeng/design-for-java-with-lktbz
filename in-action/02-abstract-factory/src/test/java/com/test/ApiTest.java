package com.test;

import com.finals.EGMCacheAdapter;
import com.finals.IIRCacheAdapter;
import com.finals.JDKProxy;
import com.inprove.CacheService;
import com.inprove.CacheServiceImpl;
import org.junit.Test;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class ApiTest {
    @Test
    public void test_CacheService() {
        CacheService cacheService =new CacheServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);
    }

}
