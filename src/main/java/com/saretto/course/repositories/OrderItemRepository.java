package com.saretto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saretto.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}