package lktbz.composite.new2021.price;

/**
 * @Description 满减
 * @Author lktbz
 * @Date 2021/06/21
 */
public class StoreDiscount implements DiscountStrategy {
    /**
     * 满500 超出部分6折
     */

    @Override
    public double getTotal(double price) {
        return 500+0.6*(price-500);
    }
}
