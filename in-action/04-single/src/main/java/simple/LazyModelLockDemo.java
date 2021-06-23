package simple;

/**
 * @Description 加锁方式解决 耗费资源
 * @Author lktbz
 * @Date 2021/06/23
 */
public class LazyModelLockDemo {
    private  LazyModelLockDemo(){}
    private static LazyModelLockDemo instance;
    private   static synchronized   LazyModelLockDemo getInstance(){
     if(instance!=null){return instance;}
     instance=new LazyModelLockDemo();
     return instance;
    }
}
