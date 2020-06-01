package lktbz.builder.springdemo;

import org.springframework.lang.Nullable;

/**
 * @ClassName GenericBeanDefinition
 * @Description 参考spring BeanDefinitionBuilder抽取出其builder 模式
 * @Author lktbz
 * @Date 2020/6/1
 */
public class GenericBeanDefinition {
    @Nullable
    private volatile Object beanClass;

    @Nullable
    public Object getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(@Nullable Object beanClass) {
        this.beanClass = beanClass;


    }

    @Override
    public String toString() {
        return "GenericBeanDefinition{" +
                "beanClass=" + beanClass +
                '}';
    }
}
