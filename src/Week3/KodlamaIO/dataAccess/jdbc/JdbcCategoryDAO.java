package Week3.KodlamaIO.dataAccess.jdbc;

import Week3.KodlamaIO.dataAccess.IBaseCategoryDAO;
import Week3.KodlamaIO.entities.Category;

public class JdbcCategoryDAO implements IBaseCategoryDAO {
    @Override
    public void add(Category category) {
        System.out.println("Category: " + category.getName() + ", added to database with JDBC");
    }
}
