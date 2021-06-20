package lktbz.template.new2021.course;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/20
 */
public class CourseTest {
    public static void main(String[] args) {
        System.out.println("java===");
        JavaCourse javaCourse=new JavaCourse();
        javaCourse.setJavaCourse(true);
        javaCourse.createWork();

        System.out.println("python===");
        PythonCourse pythonCourse=new PythonCourse();
        pythonCourse.setCheck(false);
        pythonCourse.createWork();
    }
}
