package simple;

/**
 * @Description 饿汉式方式(线程安全)
 * @Author lktbz
 * @Date 2021/06/23
 */
public class HungryModelDemo {
    private static  HungryModelDemo hungryModelDemo=new HungryModelDemo();
    private HungryModelDemo(){}
    public static HungryModelDemo getInstance(){
        return hungryModelDemo;
    }
}
