package oopWithNLayeredProject.dataAccess;

import oopWithNLayeredProject.entities.Category;
import oopWithNLayeredProject.entities.Instructor;

import java.util.List;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi: " + instructor);
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile veritabanından güncellendi: " + instructor);

    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile veritanından silindi: " + instructor);

    }

}
