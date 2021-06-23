package simple;

/**
 * @Description 懒汉式 最不安全的写法
 * @Author lktbz
 * @Date 2021/06/23
 */
public class LazyModelDemo {
   private  LazyModelDemo(){}
   private  static  LazyModelDemo lazyModelDemo;
   private   static  LazyModelDemo getInstance(){
       if(lazyModelDemo!=null){return lazyModelDemo;}
       lazyModelDemo=new LazyModelDemo();
       return lazyModelDemo;

   }
}


