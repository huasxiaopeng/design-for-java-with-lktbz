package lktbz.strategy.new2021.activity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */
public class YouHuiFactory {
    private YouHuiFactory(){};
    private static Map<String,YouHui> maps=new HashMap<>();

    /**
     * 对象进行初始化
     */
    static {
            maps.put(SelectKey.EMPTY,new EmptyYouhui());
            maps.put(SelectKey.HALF,new HalfYouHui());
            maps.put(SelectKey.THIRD,new ThirdHalfYouHui());
     }

    /**
     * map key
     */
    private static interface SelectKey{
        String EMPTY="EMPTY";
        String HALF="HALF";
        String THIRD="THIRD";
     }

    /**
     * 没有传入，先进行默认创建
     */
    public static final YouHui EMPTY=new EmptyYouhui();
    /**
     * 通过传入的key 返回相应的对象
     */
    public static YouHui getYouHui(String key){
        YouHui youHui = maps.get(key);
        return youHui ==null? EMPTY :youHui;
    }
    /**
     * 提供一个查询所有maps key的方法，供使用
     */
    public  static  Set<String>getYouHuiKeys(){
        return maps.keySet();
    }

}
