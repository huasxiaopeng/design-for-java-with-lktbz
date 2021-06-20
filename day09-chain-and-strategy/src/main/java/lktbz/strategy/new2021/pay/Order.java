package lktbz.strategy.new2021.pay;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/19
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
}
