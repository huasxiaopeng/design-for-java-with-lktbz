package lktbz.strategy.new2021.tures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */

@Component
public class WeiBoLoginHandler implements  LoginHandler{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 获取登录类型
     *
     * @return
     */
    @Override
    public LoginType getLoginType() {
        return LoginType.WEI_BO;
    }
    @Override
    public LoginResponse handleLogin(LoginRequest request) {
        logger.info("微博登录：userId：{}",request.getUserId());
        return  LoginResponse.success("微博登录成功",null);
    }
}
