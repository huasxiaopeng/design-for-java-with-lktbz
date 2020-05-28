package lktbz.strategy.lktbz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName PromotionStrategyFactory
 * @Description 策略工厂，用来消除，if else
 * @Author lktbz
 * @Date 2020/5/27
 */
public class PromotionStrategyFactory {
//    存储
    private static Map<String,IPriceStrategy> msd=new HashMap<String,IPriceStrategy>();
    static {
        msd.put(PromotionKey.SHITI,new shiTijuanStrategy());
        msd.put(PromotionKey.REDHOT,new RedHongbaoStrategy());
        msd.put(PromotionKey.CARDSUPER,new CardSuperMarketStrategy());
    }
    //默认的支付策略
    private static final IPriceStrategy empty=new DefaultStrategy();

    private PromotionStrategyFactory() {
    }

//    获取支付策略
    public  static IPriceStrategy getPromotionStrategy(String prmotionkey){
        IPriceStrategy iPriceStrategy = msd.get(prmotionkey);
        return  iPriceStrategy==null?empty:iPriceStrategy;
    }

    //得到 keys
    private static Set<String> getPromotionKeys(){
        return  msd.keySet();
    }
    private  interface PromotionKey{
        String SHITI="SHITI";
        String REDHOT="REDHOT";
        String CARDSUPER="CARDSUPER";
    }
}
