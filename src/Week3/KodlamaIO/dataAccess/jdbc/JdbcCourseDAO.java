package Week3.KodlamaIO.dataAccess.jdbc;

import Week3.KodlamaIO.dataAccess.IBaseCourseDAO;
import Week3.KodlamaIO.entities.Course;

public class JdbcCourseDAO implements IBaseCourseDAO {
    @Override
    public void add(Course course) {
        System.out.println("Course: " + course.getName() + ", added to database with JDBC");
    }
}
