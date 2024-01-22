package com.saretto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saretto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
