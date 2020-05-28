package lktbz.strategy.lktbz;

/**
 * @ClassName IPriceStrategy
 * @Description  去超市购买物品，有实体优惠卷，有红包抵扣券，有超市卡抵扣券，有直接付款
 * @Author lktbz
 * @Date 2020/5/27
 */
public interface IPriceStrategy {
    /**
     * 使用优惠方式选择
     */
    void doPay();
}
