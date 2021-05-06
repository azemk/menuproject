package com.example.menu.service;

import com.example.menu.model.Order;
import com.example.menu.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Override
    public Set<Order> getOrders() {
        return new HashSet<>(orderRepository.findAll());
    }

    @Override
    public Order getOrderById(Long id) {

        return orderRepository.findById(id).get();

    }

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
