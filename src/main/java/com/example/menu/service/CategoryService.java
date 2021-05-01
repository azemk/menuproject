package com.example.menu.service;

import com.example.menu.model.Category;



import java.util.List;

public interface CategoryService {
    public Category create (Category category);
    public Category update (Category category);
    public List<Category> getAll();
    void delete (Long id);

}
