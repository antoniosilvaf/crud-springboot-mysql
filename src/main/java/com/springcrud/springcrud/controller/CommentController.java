package com.springcrud.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.springcrud.model.Comment;
import com.springcrud.springcrud.service.CommentService;

@RestController
@RequestMapping(value = "/comments")
public class CommentController {
    
    @Autowired
    private CommentService service;

    @GetMapping
    public ResponseEntity<List<Comment>> findAll() {
        List<Comment> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
