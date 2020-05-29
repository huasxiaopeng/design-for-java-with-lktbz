package lktbz.decorator.cardec;

/**
 * @ClassName SportsCar
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("添加运动套件。。。");
    }
}
