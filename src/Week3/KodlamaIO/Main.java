package Week3.KodlamaIO;

import Week3.KodlamaIO.business.CategoryManager;
import Week3.KodlamaIO.business.CourseManager;
import Week3.KodlamaIO.business.InstructorManager;
import Week3.KodlamaIO.core.logging.*;
import Week3.KodlamaIO.dataAccess.hibernate.*;
import Week3.KodlamaIO.dataAccess.jdbc.*;
import Week3.KodlamaIO.entities.Category;
import Week3.KodlamaIO.entities.Course;
import Week3.KodlamaIO.entities.Instructor;


public class Main {

    public static void main(String[] args) throws Exception{
        // All of the Logger options but I decide to use only one of them for now.
        //ILogger[] loggers = {new DatabaseLogger(), new FileLogger(),new ConsoleLogger(),new MailLogger()};
        ILogger[] loggers = {new FileLogger()};

        // Category : Back-End
        Category category = new Category(1,"Back-End");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDAO(),loggers);
        categoryManager.add(category);
        System.out.println("------------------");

        // Course : Java 101 | Price: 2000
        Course course = new Course(1,"Java 101","This course introduces students to the Java programming language.",2000);
        CourseManager courseManager = new CourseManager(new JdbcCourseDAO(),loggers);
        courseManager.add(course);
        System.out.println("------------------");

        // Instructor : Engin Demirog
        Instructor instructor = new Instructor(1,"Engin","Demirog");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDAO(), loggers);
        instructorManager.add(instructor);
        System.out.println("------------------");

    }
}
