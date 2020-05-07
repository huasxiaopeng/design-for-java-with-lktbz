package lktbz.flyweight.demo02.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * Folder：文件夹
 *
 * @author: lktbz
 * @date: 2020/4/23 20:56
 */
public class Folder extends Dictory {
    private List<Dictory>lists;
    private Integer level;

    public Folder(String name, Integer level) {
        super(name);
        this.lists = new ArrayList<Dictory>();
        this.level = level;
    }

    public void show() {
        //控制显示区域
        System.out.println(this.name);
        for (Dictory ss: lists) {
            if(this.level!=null){
                for (int i=0;i<this.level;i++){
                    System.out.print(" ");
                }
                for (int i=0;i<this.level;i++){
                        if(i==0){
                            System.out.print("+");
                        }
                    System.out.print(" -");

                }
            }
            ss.show();

        }

    }
    public  boolean add(Dictory dictory){
        return  this.lists.add(dictory);
    }
    public boolean remove(Dictory dictory){
        return  this.lists.remove(dictory);
    }
    public Dictory get(int index){
        return  this.lists.get(index);
    }
    public void list(){
         for (Dictory dir:this.lists){
             System.out.println(dir.name);
         }
    }
}