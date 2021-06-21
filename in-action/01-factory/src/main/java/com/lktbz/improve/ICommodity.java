package com.lktbz.improve;

import java.util.Map;

/**
 * @Description 发奖接口
 * @Author lktbz
 * @Date 2021/06/21
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
