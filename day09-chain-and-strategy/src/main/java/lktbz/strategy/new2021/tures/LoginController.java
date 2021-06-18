package lktbz.strategy.new2021.tures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */
@RestController
public class LoginController {
    @Autowired
    LoginServiceImpl im;
    @PostMapping("/login")
    public LoginResponse login(@RequestParam LoginType loginType, @RequestParam Long userId){
        LoginRequest request=new LoginRequest();
        request.setLoginType(loginType);
        request.setUserId(userId);
        return im.login(request);

    }
}
