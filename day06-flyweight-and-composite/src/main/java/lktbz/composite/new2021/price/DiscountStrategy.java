package lktbz.composite.new2021.price;

/**
 * @Description 策略类
 * @Author lktbz
 * @Date 2021/06/21
 */
public interface  DiscountStrategy {
    /**
     * 获取价格
     * @param price
     * @return
     */
      double getTotal(double price);

}
