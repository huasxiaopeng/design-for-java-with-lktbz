package lktbz.strategy.lktbz;

/**
 * @ClassName Test02
 * @Description 使用到了策略工厂方式
 * @Author lktbz
 * @Date 2020/5/27
 */
public class Test02 {
    public static void main(String[] args) {
        String prky="CARDSUPER";
        IPriceStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(prky);
        promotionStrategy.doPay();
    }
}
