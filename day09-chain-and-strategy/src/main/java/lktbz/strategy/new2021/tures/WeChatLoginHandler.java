package lktbz.strategy.new2021.tures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */
@Service
public class WeChatLoginHandler implements LoginHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取登录类型
     * @return
     */
    @Override
    public LoginType getLoginType() {
        return LoginType.WE_CHAT;
    }

    /**
     * 登录
     * @param request
     * @return
     */
    @Override
    public LoginResponse handleLogin(LoginRequest request) {
        logger.info("微信登录：userId:{}"+request.getUserId());
        String  weChatName =getWechatName(request);
        return  LoginResponse.success("登录成功",weChatName) ;
    }

    private String getWechatName(LoginRequest request) {
        return  "wupx";

    }
}
