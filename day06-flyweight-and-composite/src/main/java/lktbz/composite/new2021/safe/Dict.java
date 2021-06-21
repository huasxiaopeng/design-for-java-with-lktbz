package lktbz.composite.new2021.safe;

/**
 * @Description 顶层抽象
 * @Author lktbz
 * @Date 2021/06/21
 */
public abstract  class Dict {
    protected String name;

    public Dict(String name) {
        this.name = name;
    }

    /**
     * 显示文件夹或者文件目录
     */
    public  abstract void show();
}
