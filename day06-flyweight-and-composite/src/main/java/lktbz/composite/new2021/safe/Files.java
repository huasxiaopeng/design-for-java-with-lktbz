package lktbz.composite.new2021.safe;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class Files  extends  Dict{
    public Files(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
