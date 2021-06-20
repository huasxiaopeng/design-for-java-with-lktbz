package lktbz.template.noextends;

/**
 * @ClassName AutoCar
 * @Description 自动挡
 * @Author lktbz
 * @Date 2020/5/29
 */
public class AutoCar  implements IOperation{
    @Override
    public void putGear() {
        System.out.println("挂挡");
    }

    @Override
    public void start() {
        System.out.println("踩油门");
    }
}
