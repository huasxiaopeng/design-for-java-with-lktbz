package lktbz.strategy.lktbz;

/**
 * @ClassName DefaultStrategy
 * @Description 直接付款，不使用任何优惠方式
 * @Author lktbz
 * @Date 2020/5/27
 */
public class DefaultStrategy implements IPriceStrategy {
    public void doPay() {
        System.out.println("不适用任何优惠方式进行消费");
    }
}
