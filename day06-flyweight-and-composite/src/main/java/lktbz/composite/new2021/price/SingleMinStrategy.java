package lktbz.composite.new2021.price;

/**
 * @Description 多种折扣选最低折扣
 * @Author lktbz
 * @Date 2021/06/21
 */
public class SingleMinStrategy extends CompositeDiscount {
    @Override
    public double getTotal(double price) {
       double rtn=price;
        for (DiscountStrategy strategy : strategies) {
            /**
             * 取出策略中最小的价格
             */
            rtn=Math.min(rtn, strategy.getTotal(price));
        }
        return price;
    }
}
