package lktbz.strategy.lktbz;

/**
 * @ClassName PromotionActivityDemo
 * @Description 促销活动类
 * @Author lktbz
 * @Date 2020/5/27
 */
public class PromotionActivityDemo {
    private IPriceStrategy iPriceStrategy;

    public PromotionActivityDemo(IPriceStrategy iPriceStrategy) {
        this.iPriceStrategy = iPriceStrategy;
    }
    public  void exec(){
        iPriceStrategy.doPay();
    }
}
