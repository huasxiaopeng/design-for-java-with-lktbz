package cxom.strategy.demo.change;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/02
 */
public class Context<T> {
    private ICouponDiscount<T>iCouponDiscount;

    public Context(ICouponDiscount<T> iCouponDiscount) {
        this.iCouponDiscount = iCouponDiscount;
    }

    /**
     * 支付方法
      * @param couponInfo
     * @param skuPrice
     * @return
     */
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return iCouponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
