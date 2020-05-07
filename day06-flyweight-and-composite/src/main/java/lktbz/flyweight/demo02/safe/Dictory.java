package lktbz.flyweight.demo02.safe;

/**
 * Dictory：顶层抽象
 *
 * @author: lktbz
 * @date: 2020/4/23 20:50
 */
public abstract class Dictory {

    protected   String name;

    public Dictory(String name) { this.name = name; }

    public abstract  void show();
}