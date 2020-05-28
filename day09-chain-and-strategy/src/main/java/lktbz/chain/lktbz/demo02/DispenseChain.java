package lktbz.chain.lktbz.demo02;

/**
 * @ClassName DispenseChain
 * @Description 自动售货机类
 * @Author lktbz
 * @Date 2020/5/28
 */
public interface DispenseChain {
    //下一个处理链路
    void setNextChain(DispenseChain nextChain);
    //处理类
    void dispense(Currency cur);
}

