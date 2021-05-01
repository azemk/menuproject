package com.example.menu.service;

import com.example.menu.model.Item;
import com.example.menu.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;
    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> getByCategory(String category) {
        return itemRepository.findAll()//returns List<Item>
                .stream()//returns Stream<Item>
                .filter( x -> {
                    return x.getCategory().getCategory().equals(category);
                })//returns Stream<Item>
                .collect(Collectors.toList());//List<Item>
    }

    @Override
    public void delete(Long id) {
        itemRepository.deleteById(id);
    }
}
