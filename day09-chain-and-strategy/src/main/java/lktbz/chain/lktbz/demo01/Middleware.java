package lktbz.chain.lktbz.demo01;

/**
 * @ClassName Middleware
 * @Description 抽象链构建类
 * @Author lktbz
 * @Date 2020/5/28
 */
public abstract class Middleware {
    //下一个对象
    private Middleware next;
    //构建链式
    public Middleware linkWith(Middleware next){
        this.next=next;
        return next;
    }
    //子类实现此方法
    public abstract boolean check(String email,String password);
    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     * 判断是否是最后一个处理
     */
    protected  boolean checkNext(String email,String password){
        if(next==null){
            return  true;
        }
        return check(email,password);
    }

}
