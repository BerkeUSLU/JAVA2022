package Week3.KodlamaIO.dataAccess.hibernate;

import Week3.KodlamaIO.dataAccess.IBaseCourseDAO;
import Week3.KodlamaIO.entities.Course;

public class HibernateCourseDAO implements IBaseCourseDAO {
    @Override
    public void add(Course course) {
        System.out.println("Course: " + course.getName() + ", added to database with Hibernate");
    }
}
