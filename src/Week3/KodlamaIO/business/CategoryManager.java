package Week3.KodlamaIO.business;

import Week3.KodlamaIO.core.logging.ILogger;
import Week3.KodlamaIO.dataAccess.IBaseCategoryDAO;
import Week3.KodlamaIO.entities.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CategoryManager {
    private final IBaseCategoryDAO iBaseCategoryDAO;
    private final ILogger[] loggers;
    private static final List<Category> categoryList = new ArrayList<>();

    public CategoryManager(IBaseCategoryDAO iBaseCategoryDAO, ILogger[] loggers) {
        this.iBaseCategoryDAO = iBaseCategoryDAO;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception {
        if (category.getName().trim().isEmpty()) {
            throw new Exception("Category name can not be empty!");
        }
        if (category.getID() < 0) {
            throw new Exception("Category ID number can not be lower than zero!");
        }
        for (Category category1 : categoryList) {
            if (Objects.equals(category.getName(), category1.getName())) {
                throw new Exception("You can not enter same category name twice!");
            }
        }
        categoryList.add(category);
        iBaseCategoryDAO.add(category);
        for (ILogger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
