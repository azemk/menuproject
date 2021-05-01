package com.example.menu.service;

import com.example.menu.model.Item;
import com.example.menu.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ItemService {
    public Item create (Item item);
    public Item update (Item item);
    public List<Item> getAll();
    public List<Item> getByCategory(String category);
    void delete (Long id);


}
