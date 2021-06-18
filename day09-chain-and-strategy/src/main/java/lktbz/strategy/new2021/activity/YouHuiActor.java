package lktbz.strategy.new2021.activity;

/**
 * @Description  替换执行方法
 * @Author lktbz
 * @Date 2021/06/18
 */
public class YouHuiActor {
    private YouHui youHui;

    public YouHuiActor(YouHui youHui) {
        this.youHui = youHui;
    }
    public void exec(){
        youHui.doYouhui();
    }
}
