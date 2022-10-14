package oopWithNLayeredProject.dataAccess;

import oopWithNLayeredProject.entities.Category;
import oopWithNLayeredProject.entities.Instructor;

import java.util.List;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi: " + instructor);
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC ile veritabanından güncellendi: " + instructor);

    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("JDBC ile veritabanından silindi: " + instructor);

    }

}
