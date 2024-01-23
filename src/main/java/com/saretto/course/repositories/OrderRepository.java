package com.saretto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saretto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
