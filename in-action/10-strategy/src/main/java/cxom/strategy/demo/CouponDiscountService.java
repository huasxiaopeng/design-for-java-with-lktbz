package cxom.strategy.demo;

/**
 * @Description 策略模式解决if else
 * @Author lktbz
 * @Date 2021/07/02
 *
 * 商品价格优惠方式：
 *      直减
 *      满减
 *      折扣
 *      N元购
 *   这几种方式
 *    核心处理业务参数传入优惠方式，优惠金额，商品金额，满多少减的金额方式
 *    通过大量的if 判断来确定参加的优惠方式，并计算金额
 */

public class CouponDiscountService {
    /**
     *   计算商品优惠价格
     * @param type   活动类型
     * @param typePrice  活动金额
     * @param skuPrice  商品价格
     * @param extPrice  满减金额
     * @return   实际结付金额
     */
    public double discouAc(int type,double typePrice,double skuPrice,double extPrice){
        // 1. 直减券
        if(1==type){
            return skuPrice-typePrice;
        }
        // 2. 满减券
        if(2==type){
            if(skuPrice<extPrice) {return skuPrice;}
            return skuPrice-typePrice;
        }
        //折扣券
        if(3==type){
          return skuPrice*typePrice;
        }
        // n元购
        if(4==type){
            return typePrice;
        }
        return 0d;
    }

}
