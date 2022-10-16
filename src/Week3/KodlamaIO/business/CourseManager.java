package Week3.KodlamaIO.business;

import Week3.KodlamaIO.core.logging.ILogger;
import Week3.KodlamaIO.dataAccess.IBaseCourseDAO;
import Week3.KodlamaIO.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final IBaseCourseDAO iBaseCourseDAO;
    private final ILogger[] loggers;
    private static List<Course> courseList = new ArrayList<>();

    public CourseManager(IBaseCourseDAO iBaseCourseDAO, ILogger[] loggers) {
        this.iBaseCourseDAO = iBaseCourseDAO;
        this.loggers = loggers;
    }
    public void add(Course course) throws Exception {
        if (course.getPrice() < 0) {
            throw new Exception("Course price can not be lower than zero!");
        } else if (course.getID() < 0) {
            throw new Exception("Course ID can not be negative!");
        } else if (course.getName().trim().isEmpty()) {
            throw new Exception("Course name can not be empty!");
        } else if (course.getDescription().trim().isEmpty()) {
            throw new Exception("Course description can not be empty!");
        }
        for (Course course1 : courseList) {
            if (course.getName() == course1.getName()) {
                throw new Exception("You can not enter same course twice!");
            }
        }

        courseList.add(course);
        iBaseCourseDAO.add(course);
        for (ILogger logger : loggers) {
            logger.log(course.getName());
        }
    }

}
