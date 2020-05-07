package lktbz.flyweight.demo02.safe;

/**
 * File：文件
 *
 * @author: lktbz
 * @date: 2020/4/23 20:54
 */
public class File extends Dictory {
    public File(String name) {
        super(name);
    }
    @Override
    public void show() {
        System.out.println(this.name);
    }
}