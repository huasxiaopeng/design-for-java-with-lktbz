package com.lktbz.improve;

import com.lktbz.improve.impl.CardCommodityService;
import com.lktbz.improve.impl.CouponCommodityService;
import com.lktbz.improve.impl.GoodsCommodityService;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType){return null;}
        if (1 == commodityType) {return new CouponCommodityService();}
        if (2 == commodityType){ return new GoodsCommodityService();}
        if (3 == commodityType) {return new CardCommodityService();}
        throw new RuntimeException("不存在的商品服务类型");
    }
}
