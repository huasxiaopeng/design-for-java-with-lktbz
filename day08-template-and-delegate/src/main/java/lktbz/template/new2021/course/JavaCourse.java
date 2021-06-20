package lktbz.template.new2021.course;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/20
 */
public class JavaCourse extends AbsCourse {
   private boolean isCheck;

    public void setJavaCourse(boolean isCheck) {
        this.isCheck = isCheck;
    }

    @Override
    public boolean isCheckHomeWork() {
       // return  true;  这是写死了，现在需要灵活
        return isCheck;
    }

    @Override
    protected void checkHomeWork() {
        System.out.println("检查 java 作业");
    }
}
