package lktbz.builder.springdemo;

import org.springframework.lang.Nullable;

/**
 * @ClassName GenericBeanDefinitionBuilder
 * @Description 构建者模式
 * @Author lktbz
 * @Date 2020/6/1
 */
public class GenericBeanDefinitionBuilder {
    private  GenericBeanDefinition genericBeanDefinition =new GenericBeanDefinition();


    public GenericBeanDefinitionBuilder setBeanClass(@Nullable Object beanClass) {
        genericBeanDefinition.setBeanClass(beanClass);
        return this;

    }
    public GenericBeanDefinition builder(){
        return this.genericBeanDefinition;
    }


}

