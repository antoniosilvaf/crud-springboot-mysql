package com.springcrud.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.springcrud.model.Comment;
import com.springcrud.springcrud.repository.CommentRepository;

@Service
public class CommentService {
    
    @Autowired
    CommentRepository repository;

    public List<Comment> findAll() {
        return repository.findAll();
    }
}
