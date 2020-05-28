package lktbz.strategy.lktbz;

/**
 * @ClassName shiTijuanStrategy
 * @Description 实体劵减免
 * @Author lktbz
 * @Date 2020/5/27
 */
public class shiTijuanStrategy  implements IPriceStrategy{
    public void doPay() {
        System.out.println("使用了满100减10块");
    }
}
