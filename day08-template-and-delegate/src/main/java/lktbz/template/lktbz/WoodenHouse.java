package lktbz.template.lktbz;

/**
 * @ClassName WoodenHouse
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}
