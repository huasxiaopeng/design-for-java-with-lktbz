package lktbz.composite.new2021.simple;

import lktbz.composite.demo.transparent.CourseComponent;

/**
 * @Description 顶层抽象类，实现所有可能实现的方法
 * @Author lktbz
 * @Date 2021/06/21
 */
public class AbsCourseCommpent {
    /**
     * 非 抽象方法，这样子类可以动态选择性实现方法
     * @param catalogComponent
     */
    public void addChild(AbsCourseCommpent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(AbsCourseCommpent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }


    public String getName(AbsCourseCommpent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }


    public double getPrice(AbsCourseCommpent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }


    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
