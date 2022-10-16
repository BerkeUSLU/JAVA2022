package Week3.KodlamaIO.dataAccess.hibernate;

import Week3.KodlamaIO.dataAccess.IBaseCategoryDAO;
import Week3.KodlamaIO.entities.Category;

public class HibernateCategoryDAO implements IBaseCategoryDAO {
    @Override
    public void add(Category category) {
        System.out.println("Category: " + category.getName() + ", added to database with Hibernate");
    }
}
