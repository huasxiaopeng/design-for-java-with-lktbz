package lktbz.composite.new2021.safe;

import lktbz.composite.demo.safe.Directory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class Folders  extends Dict{
    private List<Dict> dirs;
    private Integer level;

    public Folders(String name, Integer level ) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<>();
    }


    @Override
    public void show() {
        System.out.println(this.name);
        for (Dict dir : this.dirs) {
            //控制显示格式
            if(this.level != null){
                for(int  i = 0; i < this.level; i ++){
                    //打印空格控制格式
                    System.out.print("  ");
                }
                for(int  i = 0; i < this.level; i ++){
                    //每一行开始打印一个+号
                    if(i == 0){ System.out.print("+"); }
                    System.out.print("-");
                }
            }
            //打印名称
            dir.show();
        }
    }

    public boolean add(Dict dir) {
        return this.dirs.add(dir);
    }

    public boolean remove(Dict dir) {
        return this.dirs.remove(dir);
    }

    public Dict get(int index) {
        return this.dirs.get(index);
    }

    public void list(){
        for (Dict dir : this.dirs) {
            System.out.println(dir.name);
        }
    }
}
