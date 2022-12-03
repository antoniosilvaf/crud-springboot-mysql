package com.springcrud.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.springcrud.model.Post;
import com.springcrud.springcrud.repository.PostRepository;

@Service
public class PostService {
    
    @Autowired
    private PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }
}
