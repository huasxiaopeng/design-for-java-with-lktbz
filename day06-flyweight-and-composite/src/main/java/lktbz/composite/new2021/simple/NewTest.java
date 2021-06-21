package lktbz.composite.new2021.simple;

import lktbz.composite.demo.transparent.Course;
import lktbz.composite.demo.transparent.CourseComponent;
import lktbz.composite.demo.transparent.CoursePackage;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class NewTest {
    public static void main(String[] args) {

        System.out.println("============透明组合模式===========");

        AbsCourseCommpent javaBase = new NewCourse("Java入门课程",8280);
        AbsCourseCommpent ai = new NewCourse("人工智能",5000);

        AbsCourseCommpent packageCourse = new NewCoursePackage("Java架构师课程",2);

        AbsCourseCommpent design = new NewCourse("Java设计模式",1500);
        AbsCourseCommpent source = new NewCourse("源码分析",2000);
        AbsCourseCommpent softSkill = new NewCourse("软技能",3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);

        NewCoursePackage catalog = new NewCoursePackage("课程主目录",1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();


    }
}
