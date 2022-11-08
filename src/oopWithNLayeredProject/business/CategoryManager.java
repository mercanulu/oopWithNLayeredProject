package oopWithNLayeredProject.business;
import oopWithNLayeredProject.core.logging.Logger;
import oopWithNLayeredProject.dataAccess.CategoryDao;
import oopWithNLayeredProject.entities.Category;

import java.util.ArrayList;
import java.util.List;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers){
        this.categoryDao = categoryDao;
        this.loggers=loggers;

    }
    List<Category> categories = new ArrayList<>();

    public void add(Category newCategory) throws Exception{
       for(Category category:categories){

           if(category.getCategoryName().equals(newCategory.getCategoryName())){
               throw new Exception("Kategori ismi aynı olamaz!");
           }

       }
       categories.add(newCategory);
       categoryDao.add(newCategory);
       for(Logger logger:loggers){
           logger.log(newCategory.getCategoryName());
       }
    }

}
