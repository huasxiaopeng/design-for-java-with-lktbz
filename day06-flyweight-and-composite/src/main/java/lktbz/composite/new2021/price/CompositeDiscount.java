package lktbz.composite.new2021.price;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  组合的容器类
 * @Author lktbz
 * @Date 2021/06/21
 */
public class CompositeDiscount implements DiscountStrategy {
    /**
     * 存放策略的容器
     */
    protected List<DiscountStrategy> strategies =new ArrayList();

    /**
     * 添加策略
     * @param discountStrategy
     */
    public void add(DiscountStrategy discountStrategy){
        strategies.add(discountStrategy);
    }
    @Override
    public double getTotal(double price) {
        return price;
    }

}
