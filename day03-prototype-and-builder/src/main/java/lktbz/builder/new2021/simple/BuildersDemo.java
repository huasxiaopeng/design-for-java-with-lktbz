package lktbz.builder.new2021.simple;

/**
 * @Description 链式构建方式。。
 * @Author lktbz
 * @Date 2021/06/19
 */
public class BuildersDemo {
    public static void main(String[] args) {
        ISCourse build = new ISCourseBuilders()
                .addName("zs")
                .addHomework("java")
                .addNote("java note")
                .addPPT("java ppt")
                .addVideo("我最爱的三鸡")
                .build();
        System.out.println(build.toString());


    }
}
