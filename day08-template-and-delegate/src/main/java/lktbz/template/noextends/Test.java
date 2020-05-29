package lktbz.template.noextends;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class Test {
    public static void main(String[] args) {
        Car autoCar = new Car(new AutoCar());
        System.out.println("自动挡启动...");
        autoCar.drive();
        System.out.println("------------");
        Car manualCar = new Car(new ManualOperation());
        System.out.println("手动挡启动...");
        manualCar.drive();
    }
}
