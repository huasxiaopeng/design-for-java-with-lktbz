package lktbz.template.lktbz;

/**
 * @ClassName HousingClient
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/29
 */
public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
