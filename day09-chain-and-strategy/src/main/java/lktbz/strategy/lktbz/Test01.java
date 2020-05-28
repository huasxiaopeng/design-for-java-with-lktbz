package lktbz.strategy.lktbz;

import org.apache.commons.lang.StringUtils;

/**
 * @ClassName Test01
 * @Description 普通写法测试
 * @Author lktbz
 * @Date 2020/5/27
 */
public class Test01 {
    public static void main(String[] args) {
        PromotionActivityDemo promotionActivityDemo=null;
        String key="hong";
//        通常代码里都是这样写的，需要改掉 if else  等大量的选择
        if(StringUtils.equals(key,"hong")){
            promotionActivityDemo=new PromotionActivityDemo(new RedHongbaoStrategy());
        }else if(StringUtils.equals("key","shi")){
            promotionActivityDemo=new PromotionActivityDemo(new shiTijuanStrategy());

        }else {
            promotionActivityDemo=new PromotionActivityDemo(new CardSuperMarketStrategy());
        }
    }
}
