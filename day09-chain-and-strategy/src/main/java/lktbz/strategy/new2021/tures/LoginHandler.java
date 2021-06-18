package lktbz.strategy.new2021.tures;

import java.io.Serializable;

/**
 * @Description 策略接口
 * @Author lktbz
 * @Date 2021/06/18
 */
public interface LoginHandler {
    /**
     * 获取登录类型
     * @return
     */
    LoginType getLoginType();

   LoginResponse handleLogin(LoginRequest request);

}
