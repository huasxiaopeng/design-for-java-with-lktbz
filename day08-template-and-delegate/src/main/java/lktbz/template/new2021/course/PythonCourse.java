package lktbz.template.new2021.course;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/20
 */
public class PythonCourse extends AbsCourse {
  private boolean isCheck;
  public void setCheck(boolean isCheck){
      this.isCheck=isCheck;
  }
    @Override
    public boolean isCheckHomeWork() {
        return isCheck;
    }
    @Override
    protected void checkHomeWork() {
        System.out.println("检查 python 作业。。。");
    }
}
