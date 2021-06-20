package lktbz.template.new2021.course;

/**
 * @Description  抽象课程类
 * @Author lktbz
 * @Date 2021/06/20
 */
public abstract   class  AbsCourse {
    /**
     * 课程模板方法
     */
    public final void createWork(){
        /**
         * 发布预习资料
         */
         sendWorks();
        /**
         * 上课
         */
        doWorks();
        /**
         * 发送PPT
         */
        doPPT();
        /**
         * 布置作业
         */
        doHomeWork();
        /**
         * 检查作业
         *
         */
        if(isCheckHomeWork()){
            /**
             * 不是每个课程都有作业
             */
            checkHomeWork();
        }
    }

    /**
     *    检查作业，需要子类去实现
     */
    protected abstract void checkHomeWork();

    public void doHomeWork() {
        System.out.println("布置作业");
    }

    public void doPPT() {
        System.out.println("发送PPT");
    }

    public void doWorks() {
        System.out.println("上课");
    }

    public void sendWorks() {
        System.out.println("发布预习资料");
    }


    /**
     * 钩子方法，是否检查作业
     * @return
     */
    public  boolean isCheckHomeWork(){
        return false;
    }
}
