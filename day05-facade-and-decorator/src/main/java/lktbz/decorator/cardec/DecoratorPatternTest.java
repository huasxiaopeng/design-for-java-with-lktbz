package lktbz.decorator.cardec;

/**
 * @ClassName DecoratorPatternTest
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sport=new SportsCar(new BasicCar());
        sport.assemble();
        System.out.println("\n*****");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
