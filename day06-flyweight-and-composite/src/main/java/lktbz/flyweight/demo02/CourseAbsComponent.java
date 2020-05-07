package lktbz.flyweight.demo02;

/**
 * CourseAbsComponent：顶层抽象类
 *
 * @author: lktbz
 * @date: 2020/4/23 20:05
 */
public abstract class CourseAbsComponent {
  public  void addChild(CourseAbsComponent courseAbsComponent){
        throw new UnsupportedOperationException("不支持添加操作");
  }
  public  void removeChild(CourseAbsComponent courseAbsComponent){
        throw new UnsupportedOperationException("不支持移除操作");
  }
  public  String getName(CourseAbsComponent courseAbsComponent){
        throw new UnsupportedOperationException("不执行查询操作");
  }
  public  double getPrice(CourseAbsComponent courseAbsComponent){
        throw  new UnsupportedOperationException("不支持获取价格操作");
  }
  public void  print(){
      throw new UnsupportedOperationException("不支持打印操作");
  }
}