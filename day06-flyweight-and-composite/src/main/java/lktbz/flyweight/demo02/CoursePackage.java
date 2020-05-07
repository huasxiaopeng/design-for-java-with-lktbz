package lktbz.flyweight.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * CoursePackage：课程包，也就是存储节点的类
 *
 * @author: lktbz
 * @date: 2020/4/23 20:12
 */
public class CoursePackage  extends  CourseAbsComponent{
    private List<CourseAbsComponent >absComponents=new ArrayList<CourseAbsComponent>();
    private String name;
    private Integer levlel;

    public CoursePackage(String name, Integer levlel) {
        this.name = name;
        this.levlel = levlel;
    }

    @Override
    public void addChild(CourseAbsComponent courseAbsComponent) {
        absComponents.add(courseAbsComponent);
    }

    @Override
    public void removeChild(CourseAbsComponent courseAbsComponent) {
       absComponents.remove(courseAbsComponent);
    }

    @Override
    public String getName(CourseAbsComponent courseAbsComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CourseAbsComponent vc:absComponents){
            if(this.levlel!=null){
                for (int i=0;i<this.levlel;i++){
                    System.out.print(" ");
                }
                for (int i=0;i<this.levlel;i++){
                    if(i==0){
                        System.out.print("+ ");
                    }
                    System.out.print("--");
                }
            }
            vc.print();
        }
    }
}