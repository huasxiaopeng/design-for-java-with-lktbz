package lktbz.composite.new2021.price;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class Order {
    public double price;
    private String type;
    public DiscountStrategy discountStrategy;
    public Order(double price) {
        this.price=price;
    }
    public void display(){
        System.out.println("总价："+price);
        System.out.println("是否是VIP？y/n");
        Scanner scanner=new Scanner(System.in);
        type=scanner.next();
        System.out.println("是否超过500？y/n");
        String tmp;
        tmp=scanner.next();
        type+=tmp;
        System.out.println("是否满足活动价？y/n");
        tmp=scanner.next();
        type+=tmp;
        DiscountFactory discountFactory=new DiscountFactory();
        double discountPrice=discountFactory.create(type).getTotal(price);
        System.out.println("优惠："+(price-discountPrice));
        System.out.println("应付："+discountPrice);

    }
}
class Client {
    public static void main(String[] args) {
        Order order=new Order(620);
        order.display();
    }
}