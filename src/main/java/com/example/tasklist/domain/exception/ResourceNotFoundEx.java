package com.example.tasklist.domain.exception;
//В базе данных нету
public class ResourceNotFoundEx extends RuntimeException{
    public ResourceNotFoundEx(String message) {
        super(message);
    }
}
