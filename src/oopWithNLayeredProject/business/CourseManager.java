package oopWithNLayeredProject.business;

import oopWithNLayeredProject.core.logging.Logger;
import oopWithNLayeredProject.dataAccess.CourseDao;

import oopWithNLayeredProject.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }
    List<Course> courses = new ArrayList<>();
    public void add(Course newCourse) throws Exception{
        if(newCourse.getCoursePrice()<0){
            throw new Exception("Kurs fiyatı 0' dan küçük olamaz.");
        }


        for(Course course:courses){
            if(course.getCourseName().equals(newCourse.getCourseName())){
                throw new Exception("Farklı bir kurs ismi giriniz.");
            }
        }
        courses.add(newCourse);
        courseDao.add(newCourse);
        for(Logger log:loggers){
            log.log(newCourse.getCourseName());
        }

    }
}
