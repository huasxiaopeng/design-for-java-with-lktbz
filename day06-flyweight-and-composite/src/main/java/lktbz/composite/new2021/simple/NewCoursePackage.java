package lktbz.composite.new2021.simple;

import lktbz.composite.demo.transparent.CourseComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 课程包类，用于对数据类型的管理
 * @Author lktbz
 * @Date 2021/06/21
 */
public class NewCoursePackage  extends AbsCourseCommpent{
    private List<AbsCourseCommpent> absCourseCommpentList=new ArrayList<>();
    /**
     * 结点名字
     */
    private String name;
    /**
     * 结点等级
     */
    private Integer level;

    public NewCoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    /**
     * addChild removeChild print  都是对元素的操作
     * @param catalogComponent
     */
    @Override
    public void addChild(AbsCourseCommpent catalogComponent) {
       absCourseCommpentList.add(catalogComponent);
    }

    @Override
    public void removeChild(AbsCourseCommpent catalogComponent) {
        absCourseCommpentList.remove(catalogComponent);
    }

    @Override
    public String getName(AbsCourseCommpent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        /**
         * 格式化打印
         */
        System.out.println(this.name);

        for(AbsCourseCommpent catalogComponent : absCourseCommpentList){
            //控制显示格式
            if(this.level != null){
                for(int  i = 0; i < this.level; i ++){
                    //打印空格控制格式
                    System.out.print("  ");
                }
                for(int  i = 0; i < this.level; i ++){
                    //每一行开始打印一个+号
                    if(i == 0){ System.out.print("+"); }
                    System.out.print("-");
                }
            }
            //打印标题
            catalogComponent.print();
        }
    }
}
