package com.adapter.demo.adapter;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Description 自己定义书写的消息适配器
 * @Author lktbz
 * @Date 2021/06/24
 */
public class LktbzMQAdapter {
    public static  RebateInfo filter(String json, Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       return  parse(JSON.parseObject(json,Map.class),link);
    }
    private static RebateInfo parse(Map parseObject, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo=new RebateInfo();
        for (String key : link.keySet()) {
             Object val=  parseObject.get(link.get(key));
            RebateInfo.class.getMethod("set"+key.substring(0,1).toUpperCase()+key.substring(1),String.class).invoke(rebateInfo,val.toString());
        }
        return rebateInfo;
    }
}
