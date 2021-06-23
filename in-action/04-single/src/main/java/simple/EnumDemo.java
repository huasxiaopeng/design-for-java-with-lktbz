package simple;

import org.junit.Test;

/**
 * @Description 枚举单利
 * @Author lktbz
 * @Date 2021/06/23
 */
public enum  EnumDemo {
    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }
    @Test
    public void test1() {
        EnumDemo.INSTANCE.test();
    }
}

