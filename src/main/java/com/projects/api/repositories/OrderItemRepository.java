package com.projects.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.api.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
