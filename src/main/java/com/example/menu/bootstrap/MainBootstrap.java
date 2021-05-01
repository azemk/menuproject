package com.example.menu.bootstrap;

import com.example.menu.model.Category;
import com.example.menu.model.Item;
import com.example.menu.repository.CategoryRepository;
import com.example.menu.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MainBootstrap implements ApplicationRunner {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        try{
            Category snacks = new Category("snacks","url:fgyegui");
            categoryRepository.save(snacks);
            Category first = new Category("soup","url:dgvgasdji");
            categoryRepository.save(first);
            Item item1 = new Item("sandwich","bread,avocado,eggs","150 gram",230.5,"url:fdfg",snacks);
            itemRepository.save(item1);
            Item item2 = new Item("cheesy soup","cheese,milk,oil","200 gram",150.00,"url:ggwr",first);
            itemRepository.save(item2);
        }catch (Exception ex){
            System.out.println(ex.getCause()+ex.getMessage());

        }finally {
            System.out.println("Your app is working!");
        }


    }
}
