package lktbz.decorator.general;

/**
 * 被装饰对象，具体的对象
 */
public class ConcreteComponent extends Component {
  
    @Override
    public void operation() {
        //相应的功能处理
        System.out.println("处理业务逻辑");
    }  
  
}  