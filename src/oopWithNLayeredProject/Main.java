package oopWithNLayeredProject;


import oopWithNLayeredProject.business.CategoryManager;
import oopWithNLayeredProject.business.CourseManager;
import oopWithNLayeredProject.core.logging.DatabaseLogger;
import oopWithNLayeredProject.core.logging.FileLogger;
import oopWithNLayeredProject.core.logging.Logger;
import oopWithNLayeredProject.core.logging.MailLogger;
import oopWithNLayeredProject.dataAccess.HibernateCategoryDao;
import oopWithNLayeredProject.dataAccess.HibernateCourseDao;
import oopWithNLayeredProject.dataAccess.JdbcCategoryDao;
import oopWithNLayeredProject.dataAccess.JdbcCourseDao;
import oopWithNLayeredProject.entities.Category;
import oopWithNLayeredProject.entities.Course;
import oopWithNLayeredProject.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
        Category category1 = new Category(1,"Programlama");
        Category category2 = new Category(2, "Web Geliştirme");
        Category category3 = new Category(3, "Programlama");
        Category[] categories = {category1, category2, category3};
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);


        /*for(Category category:categories){
            categoryManager.add(category);
            System.out.println("------------------------");
        }*/

        Instructor instructor = new Instructor(1,"Engin Demiroğ");
        Course course1 = new Course(1,"Java 101", 1000) ;
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);


        Course course2 = new Course(2,"Java 102",-100);

        Course[] courses ={course1,course2};
        for(Course course:courses){
            courseManager.add(course);
            System.out.println("------------------------");

        }




    }
}
