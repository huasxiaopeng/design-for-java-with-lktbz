package lktbz.iterator.course;

/**
 * Created by Tom.
 */
public interface ICourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
