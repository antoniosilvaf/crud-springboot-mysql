package com.springcrud.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.springcrud.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>  {
    
}
