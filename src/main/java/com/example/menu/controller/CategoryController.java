package com.example.menu.controller;

import com.example.menu.model.Category;
import com.example.menu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @PostMapping("/create")
    public Category create (@RequestBody Category category){
        return categoryService.create(category);
    }
    @PostMapping("/update")
    public Category update (@RequestBody Category category){
        return categoryService.update(category);

    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id ){
        categoryService.delete(id);
    }
}
