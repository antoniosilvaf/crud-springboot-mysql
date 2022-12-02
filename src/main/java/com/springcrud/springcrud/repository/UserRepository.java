package com.springcrud.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.springcrud.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
