package oopWithNLayeredProject.dataAccess;
import oopWithNLayeredProject.entities.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi: " + category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile veritabanından güncellendi: " + category.getCategoryName());

    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile veritabanından silindi: " + category.getCategoryName());

    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }
}
