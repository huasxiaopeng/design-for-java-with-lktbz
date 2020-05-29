package lktbz.decorator.cardec;

/**
 * @ClassName CarDecorator
 * @Description car 的装饰器类
 * @Author lktbz
 * @Date 2020/5/29
 */
public class CarDecorator  implements Car{
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
    public void assemble() {
        this.car.assemble();
    }
}
