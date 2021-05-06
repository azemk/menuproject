package com.example.menu.controller;

import com.example.menu.model.Item;
import com.example.menu.model.Order;
import com.example.menu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/getOrders")
    public Set<Order> getOrders(){
        return orderService.getOrders();
    }
    @PostMapping("/create")
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }
    @PostMapping("/update")
    public Order update(@RequestBody Order order){
        return orderService.create(order);
    }
    @GetMapping("/getOrderById")
    public Order getOrderById(@PathVariable Long id ){
        return orderService.getOrderById(id);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id ){
        orderService.delete(id);
    }
}
