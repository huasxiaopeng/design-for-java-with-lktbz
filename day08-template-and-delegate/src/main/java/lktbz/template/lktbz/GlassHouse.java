package lktbz.template.lktbz;

/**
 * @ClassName GlassHouse
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }

}
