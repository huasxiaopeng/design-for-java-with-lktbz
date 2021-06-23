package simple;

/**
 * @Description 饿汉式之内部类创建  比较推荐的一种方式
 * @Author lktbz
 * @Date 2021/06/23
 */
public class HungryInnerDemo {
    private HungryInnerDemo (){}
    private static class HunHolder{
        private static   HungryInnerDemo instance=new HungryInnerDemo();
    }
    public static HungryInnerDemo getInstance(){
        return HunHolder.instance;
    }
}
