package lktbz.strategy.lktbz;

/**
 * @ClassName CardSuperMarketStrategy
 * @Description 超市实体卡
 * @Author lktbz
 * @Date 2020/5/27
 */
public class CardSuperMarketStrategy  implements IPriceStrategy{
    public void doPay() {
        System.out.println("超市实体卡，使用方式");
    }
}
