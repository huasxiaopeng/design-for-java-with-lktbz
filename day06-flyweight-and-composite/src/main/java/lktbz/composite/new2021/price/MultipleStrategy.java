package lktbz.composite.new2021.price;

/**
 * @Description 多种折扣用折上折
 * @Author lktbz
 * @Date 2021/06/21
 */
public class MultipleStrategy  extends CompositeDiscount {
    @Override
    public double getTotal(double price) {
        double rtn = price;
        for (DiscountStrategy s : strategies) {
            rtn = s.getTotal(rtn);
        }
        return rtn;
    }
}
