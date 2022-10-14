package oopWithNLayeredProject.dataAccess;



import oopWithNLayeredProject.entities.Course;

import java.util.List;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi: " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile veritabanından silindi: " + course);

    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile veritabanından güncellendi: " + course);

    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }


}
