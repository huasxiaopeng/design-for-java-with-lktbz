package lktbz.template.noextends;

/**
 * @ClassName ManualOperation
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class ManualOperation implements IOperation {
    @Override
    public void putGear() {
        System.out.println("踩离合，挂挡");
    }

    @Override
    public void start() {
        System.out.println("松离合，踩油门");
    }
}
