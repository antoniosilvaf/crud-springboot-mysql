package com.springcrud.springcrud.service.exception;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L; 

    public ResourceNotFoundException(Object id) {
        super("Not Found. Id " + id);
    }
    
}
