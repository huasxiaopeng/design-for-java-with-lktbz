package lktbz.strategy.new2021.tures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 返回相应类型
 * @Author lktbz
 * @Date 2021/06/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String msg;
    private Object data;
    public static LoginResponse success(String msg, Object data){
        return new LoginResponse(msg,data);
    }
}
