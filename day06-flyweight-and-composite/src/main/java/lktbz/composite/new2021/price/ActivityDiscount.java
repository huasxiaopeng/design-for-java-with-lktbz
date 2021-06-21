package lktbz.composite.new2021.price;

/**
 * @Description 活动9折
 * @Author lktbz
 * @Date 2021/06/21
 */
public class ActivityDiscount implements DiscountStrategy{
    /**
     *  9折
     * @param price
     * @return
     */
    @Override
    public double getTotal(double price) {
        return 0.9*price;
    }
}
