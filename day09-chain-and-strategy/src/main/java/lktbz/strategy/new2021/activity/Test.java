package lktbz.strategy.new2021.activity;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/18
 */
public class Test {
    public static void main(String[] args) {
        /**
         *     没有参考设计模式  1.0
         */
        /**String title="half";
         if(title.equals("empty")){
         YouHui youHui=new EmptyYouhui();
         youHui.doYouhui();
         }else if(title.equals("half")){
         YouHui youHui=new HalfYouHui();
         youHui.doYouhui();
         }else {
         YouHui youHui=new ThirdHalfYouHui();
         youHui.doYouhui();
         }**/
        /**
         *   先将这些对象的创建进行提取,包装  2.0
         */
        /**
        String title = "half";
        if (title.equals("empty")) {
          YouHuiActor actor=new YouHuiActor(new EmptyYouhui());
           actor.exec();
        } else if (title.equals("half")) {
            YouHuiActor actor=new YouHuiActor(new HalfYouHui());
            actor.exec();
        } else {
            YouHuiActor actor=new YouHuiActor(new ThirdHalfYouHui());
            actor.exec();
        }**/
        /**
         * 继续构建，将创建的对象提前创建好，我只需要，使用  3.0 最终版
         */
        String title = "THIRD";
        YouHui youHui = YouHuiFactory.getYouHui(title);
        youHui.doYouhui();
        //todo 两行代码搞定
    }
}
