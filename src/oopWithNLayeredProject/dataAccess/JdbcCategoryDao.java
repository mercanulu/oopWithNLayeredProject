package oopWithNLayeredProject.dataAccess;

import oopWithNLayeredProject.entities.Category;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi: " + category);
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC ile veritabanından güncellendi: " + category);

    }

    @Override
    public void delete(Category category) {
        System.out.println("JDBC ile veritabanından silindi: " + category);

    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }
}
