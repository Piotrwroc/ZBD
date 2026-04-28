package com.example.zbd.repositories;

import com.example.zbd.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    public Order findOrdersByCustomerId(Long customerId);
}
