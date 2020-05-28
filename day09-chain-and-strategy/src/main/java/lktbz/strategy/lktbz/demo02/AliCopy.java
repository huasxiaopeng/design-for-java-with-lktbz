package lktbz.strategy.lktbz.demo02;

/**
 * @ClassName AliCopy
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/27
 */
public class AliCopy  extends  AbsCopyMachine{
    public Item copy(String url) {
        System.out.println("阿里页面："+url);
        System.out.println("通过JSoup爬虫获取相关信息，组装item");
        return new Item();
    }
    public static CopyMachineType getType(){
        return CopyMachineType.ALI;
    }
}
