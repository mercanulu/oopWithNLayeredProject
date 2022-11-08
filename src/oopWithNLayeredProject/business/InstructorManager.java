package oopWithNLayeredProject.business;
import oopWithNLayeredProject.core.logging.Logger;
import oopWithNLayeredProject.dataAccess.InstructorDao;
import oopWithNLayeredProject.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;
    public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
        this.instructorDao=instructorDao;
        this.loggers=loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(Logger logger:loggers){
            logger.log(instructor.getFullName());
        }
    }

}
