package lktbz.composite.new2021.price;

/**
 * @Description Vip 折扣
 * @Author lktbz
 * @Date 2021/06/21
 */
public class VIPDiscount implements DiscountStrategy {
    /**
     * 95 折
     * @param price
     * @return
     */
    @Override
    public double getTotal(double price) {
        return 0.95*price;
    }
}
