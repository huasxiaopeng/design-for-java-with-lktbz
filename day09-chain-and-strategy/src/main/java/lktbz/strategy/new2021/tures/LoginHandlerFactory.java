package lktbz.strategy.new2021.tures;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */

@Component
public class LoginHandlerFactory implements InitializingBean, ApplicationContextAware {
    private static final Map<LoginType, LoginHandler> LOGIN_HANDLER_MAP = new EnumMap<>(LoginType.class);
    private ApplicationContext appContext;

    /**
     * 根据登录类型获取相应的处理器
     * @param type
     * @return
     */
    public LoginHandler getHandler(LoginType type){
        return LOGIN_HANDLER_MAP.get(type);
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        /**
         *
         *将 Spring 容器中所有的 LoginHandler 注册到 LOGIN_HANDLER_MAP
         */
        appContext.getBeansOfType(LoginHandler.class)
                .values()
                .forEach(loginHandler -> LOGIN_HANDLER_MAP.put(loginHandler.getLoginType(),loginHandler));
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appContext=applicationContext;
    }
}
