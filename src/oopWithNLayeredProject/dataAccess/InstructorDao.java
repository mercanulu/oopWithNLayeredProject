package oopWithNLayeredProject.dataAccess;

import oopWithNLayeredProject.entities.Category;
import oopWithNLayeredProject.entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);
    void update(Instructor instructor);
    void delete(Instructor instructor);

}
