package lktbz.strategy.new2021.tures;

import lombok.Data;

/**
 * @Description 客户端传递的参数封装
 * @Author lktbz
 * @Date 2021/06/18
 */
@Data
public class LoginRequest {
    private LoginType loginType;
    private Long userId;

}
