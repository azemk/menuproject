package com.example.menu.controller;

import com.example.menu.model.Item;
import com.example.menu.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;
    @GetMapping("/getAll")
    public List<Item> getAll(){
        return itemService.getAll();
    }
    @PostMapping("/create")
    public Item create(@RequestBody Item  item){
        return itemService.create(item);
    }
    @PostMapping("/update")
    public Item update (@RequestBody Item item){
        return itemService.update(item);
    }
    @GetMapping("/getByCategory/{category}")
    public List<Item> getByCategory(@PathVariable String category){
        return itemService.getByCategory(category);

    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id ){
        itemService.delete(id);
    }

}
