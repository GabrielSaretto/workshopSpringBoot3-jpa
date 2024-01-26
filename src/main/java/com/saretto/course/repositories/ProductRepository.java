package com.saretto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saretto.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
