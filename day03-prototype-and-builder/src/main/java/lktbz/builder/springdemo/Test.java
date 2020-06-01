package lktbz.builder.springdemo;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lktbz
 * @Date 2020/6/1
 */
public class Test {
    public static void main(String[] args) {
        GenericBeanDefinition builder = new GenericBeanDefinitionBuilder()
                .setBeanClass(String.class)
                .builder();
        System.out.println("这是我创建好的构造者模式"+builder);
    }
}
