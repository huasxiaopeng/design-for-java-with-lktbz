package lktbz.flyweight.demo02;

/**
 * Test：组合模式测试
 *
 * @author: lktbz
 * @date: 2020/4/23 20:18
 */
public class Test {
    public static void main(String[] args) {
        CourseAbsComponent java=new Course("java",8200);
        CourseAbsComponent ai=new Course("ai",5300);

        CourseAbsComponent packageCourse=new CoursePackage("java 架构课",2);
        CourseAbsComponent design=new Course("design",200);
        CourseAbsComponent source=new Course("源码",400);
        CourseAbsComponent softKill=new Course("软技能",100);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softKill);

        CourseAbsComponent mainCourse=new CoursePackage("课程主目录",1);
        mainCourse.addChild(java);
        mainCourse.addChild(ai);
        mainCourse.addChild(packageCourse);


        mainCourse.print();

    }
}