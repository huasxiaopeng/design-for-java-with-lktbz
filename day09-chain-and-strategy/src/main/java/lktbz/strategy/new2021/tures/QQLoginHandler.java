package lktbz.strategy.new2021.tures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Description QQ登录处理类
 * @Author lktbz
 * @Date 2021/06/18
 */

@Component
public class QQLoginHandler  implements LoginHandler{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取登录类型
     *
     * @return
     */
    @Override
    public LoginType getLoginType() {
        return LoginType.QQ;
    }


    @Override
    public LoginResponse handleLogin(LoginRequest request) {
        logger.info("QQ登录：userId：{}", request.getUserId());
        return LoginResponse.success("QQ登录成功", null);

    }
}
