package lktbz.decorator.cardec;

/**
 * @ClassName LuxuryCar
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class LuxuryCar  extends  CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("增加一个超跑大灯");
    }
}
