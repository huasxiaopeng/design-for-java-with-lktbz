package lktbz.strategy.new2021.tures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */
@Service
public class LoginServiceImpl {
    @Autowired
    private  LoginHandlerFactory loginHandlerFactory;

    public LoginResponse login(LoginRequest request){
        LoginType loginType = request.getLoginType();
        LoginHandler handler = loginHandlerFactory.getHandler(loginType);
        return handler.handleLogin(request);
    }
}
