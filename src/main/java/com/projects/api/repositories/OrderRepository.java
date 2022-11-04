package com.projects.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.api.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
