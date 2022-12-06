package com.springcrud.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.springcrud.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
