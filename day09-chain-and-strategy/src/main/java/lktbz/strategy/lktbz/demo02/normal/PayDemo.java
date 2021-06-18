package lktbz.strategy.lktbz.demo02.normal;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */
public class PayDemo {
    /**
     * 现在需要根据传入的不同支付方式，调用不同的支付请求
     * @param args
     */
    public static void main(String[] args) {
            toPay("ali");
            toPay("weichat");
    }
    public static void toPay(String code){
        //过多的if
          if(code.equals("ali")){
              System.out.println("调用阿里的支付");
          }else if(code.equals("JD")){
              System.out.println("调用京东的支付");
          }else if(code.equals("weichat")){
              System.out.println("调用微信支付");
          }else {
              System.out.println("调用其他支付方式");

          }

    }
}
