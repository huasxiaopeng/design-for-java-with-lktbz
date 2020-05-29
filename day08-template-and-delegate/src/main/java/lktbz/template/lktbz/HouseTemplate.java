package lktbz.template.lktbz;

/**
 * @ClassName HouseTemplate
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public abstract class HouseTemplate {
    //创建房子步骤 final 不让覆盖
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }
    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

}
