package com.example.tasklist.domain.exception;
//Если ошибка в JDBS в базе данных
public class ResourceMapingException extends RuntimeException {
    public ResourceMapingException(String message) {
        super(message);
    }
}
