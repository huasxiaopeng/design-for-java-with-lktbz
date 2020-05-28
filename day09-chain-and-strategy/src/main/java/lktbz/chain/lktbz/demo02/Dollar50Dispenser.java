package lktbz.chain.lktbz.demo02;

/**
 * @ClassName Dollar50Dispenser
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/28
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    public void dispense(Currency cur) {
            if(cur.getAmount()>=50){
                int num = cur.getAmount() / 50;
                //余额
                int remainder  = cur.getAmount() % 50;
                System.out.println("Dispensing "+num+" 50$ note");
                if(remainder!=0)this.chain.dispense(new Currency(remainder));
            }else {
                //别的金额交给别人处理
                this.chain.dispense(cur);
            }
    }
}
