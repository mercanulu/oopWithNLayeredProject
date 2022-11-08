package oopWithNLayeredProject.dataAccess;
import oopWithNLayeredProject.entities.Course;

import java.util.List;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi: " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("JDBC ile veritabanından silindi: " + course);

    }

    @Override
    public void update(Course course) {
        System.out.println("JDBC ile veritabanından güncellendi: " + course);

    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }


}
