package Week3.KodlamaIO.dataAccess.jdbc;

import Week3.KodlamaIO.dataAccess.IBaseInstructorDAO;
import Week3.KodlamaIO.entities.Instructor;

public class JdbcInstructorDAO implements IBaseInstructorDAO {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ", added to database with JDBC");
    }
}
