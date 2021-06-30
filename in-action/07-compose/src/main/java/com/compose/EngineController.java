package com.compose;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 传统方式解决
 * @Author lktbz
 * @Date 2021/06/26
 */
public class EngineController {
    private  static  Logger logger= LoggerFactory.getLogger(EngineController.class);
        public String process(final String userId, final String userSex, final int userAge){
            logger.info("ifelse实现方式判断用户结果。userId：{} userSex：{} userAge：{}", userId, userSex, userAge);
            if("man".equals(userSex)){
                if(userAge<25){
                    return "果实A";
                }
                if(userAge>=25){
                    return "果实B";
                }
            }
            if("woman".equals(userSex)){
                if (userAge < 25) {
                    return "果实C";
                }
                if (userAge >= 25) {
                    return "果实D";
                }
            }
            return null;
        }

    public static void main(String[] args) {
        EngineController engineController = new EngineController();
        String process = engineController.process("Oli09pLkdjh", "man", 29);
        logger.info("测试结果：{}", process);
    }
}
