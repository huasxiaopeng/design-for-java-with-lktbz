package lktbz.flyweight.demo02;

/**
 * Course：课程类
 *
 * @author: lktbz
 * @date: 2020/4/23 20:10
 */
public class Course  extends  CourseAbsComponent{
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseAbsComponent courseAbsComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CourseAbsComponent courseAbsComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name+"价格为："+price+" 元");
    }
}