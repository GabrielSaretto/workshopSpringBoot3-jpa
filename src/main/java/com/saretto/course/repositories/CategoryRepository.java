package com.saretto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saretto.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
