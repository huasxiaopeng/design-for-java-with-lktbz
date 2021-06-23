package simple;

/**
 * @Description 双重检查锁方式
 * @Author lktbz
 * @Date 2021/06/23
 */
public class HungryDoubleCheckDemo {
    private static volatile HungryDoubleCheckDemo doubleCheckDemo;
    private HungryDoubleCheckDemo(){}
    public static HungryDoubleCheckDemo getInstance(){
        if(null != doubleCheckDemo) {return doubleCheckDemo;}
        synchronized (HungryDoubleCheckDemo.class){
            if (null == doubleCheckDemo){
                doubleCheckDemo = new HungryDoubleCheckDemo();
            }
        }
        return doubleCheckDemo;
    }
}
