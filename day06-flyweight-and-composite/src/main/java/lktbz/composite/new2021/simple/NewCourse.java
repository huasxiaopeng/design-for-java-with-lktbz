package lktbz.composite.new2021.simple;

/**
 * @Description  课程类
 * @Author lktbz
 * @Date 2021/06/21
 */
public class NewCourse extends AbsCourseCommpent {
    private String name;
    private double price;

    public NewCourse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(AbsCourseCommpent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(AbsCourseCommpent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name + " (￥" + price + "元)");
    }
}
