package lktbz.builder.new2021.simple;

/**
 * @Description builders 类
 * @Author lktbz
 * @Date 2021/06/19
 */
public class ISCourseBuilders {
    private ISCourse isCourse = new ISCourse();

    public ISCourseBuilders addName(String name) {
        isCourse.setName(name);
        return this;
    }
    public ISCourseBuilders addPPT(String ppt) {
        isCourse.setPpt(ppt);
        return this;
    }
    public ISCourseBuilders addVideo(String video) {
        isCourse.setVideo(video);
        return this;
    }

    public ISCourseBuilders addNote(String note) {
        isCourse.setNote(note);
        return this;
    }

    public ISCourseBuilders addHomework(String homework) {
        isCourse.setHomework(homework);
        return this;
    }
//    public   ISCourse build(){
//        return isCourse;
//    }
    public   ISCourse build(){
        return this.isCourse;
    }
}

