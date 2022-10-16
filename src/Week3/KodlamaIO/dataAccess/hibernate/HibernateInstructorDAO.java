package Week3.KodlamaIO.dataAccess.hibernate;

import Week3.KodlamaIO.dataAccess.IBaseInstructorDAO;
import Week3.KodlamaIO.entities.Instructor;

public class HibernateInstructorDAO implements IBaseInstructorDAO {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ", added to database with Hibernate");
    }
}
