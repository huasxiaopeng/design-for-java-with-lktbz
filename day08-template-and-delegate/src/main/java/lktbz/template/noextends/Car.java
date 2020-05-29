package lktbz.template.noextends;

/**
 * @ClassName Car
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class Car {
    private IOperation operation;
    private Car(){}
    public Car(IOperation operation) {
        this.operation = operation;
    }
    //定义模板顺序
    public final void drive(){
        ignite();
        putGear();
        handlBreak();
        start();
    }
    /**
     * 小汽车启动方式
     */
    private void ignite() {
        System.out.println("点火启动");
    }

    private void putGear() {
        operation.putGear();
    }

    private void handlBreak() {
        System.out.println("松手刹");
    }

    private void start() {
        operation.start();
    }
}
