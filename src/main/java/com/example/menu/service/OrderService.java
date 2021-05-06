package com.example.menu.service;


import com.example.menu.model.Order;

import java.util.Set;

public interface OrderService {
    Set<Order> getOrders();
    Order getOrderById(Long id);
    public Order create (Order order);
    public Order update(Order order);
    void delete(Long id);
}
