package Week3.KodlamaIO.business;

import Week3.KodlamaIO.core.logging.ILogger;
import Week3.KodlamaIO.dataAccess.IBaseInstructorDAO;
import Week3.KodlamaIO.entities.Course;
import Week3.KodlamaIO.entities.Instructor;
import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private IBaseInstructorDAO iBaseInstructorDAO;
    private ILogger[] loggers;
    private static List<Instructor> instructorList = new ArrayList<>();

    public InstructorManager(IBaseInstructorDAO iBaseInstructorDAO, ILogger[] loggers) {
        this.iBaseInstructorDAO = iBaseInstructorDAO;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        if (instructor.getFirstName().trim().isEmpty() || instructor.getLastName().trim().isEmpty()) {
            throw new Exception("Instructor's first name or last name can not be empty!");
        }
        else if (instructor.getID() < 0) {
            throw new Exception("Instructor ID can not be negative!");
        }
        for (Instructor instructor1 : instructorList) {
            if (instructor.getFirstName() == instructor1.getFirstName() && instructor.getLastName() == instructor1.getLastName()) {
                throw new Exception("You can not enter same instructor twice!");
            }
        }
        instructorList.add(instructor);
        iBaseInstructorDAO.add(instructor);
        for (ILogger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}