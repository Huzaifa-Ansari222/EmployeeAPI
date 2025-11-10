package com.example.leavemanagement.exception;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException (String message){
        super(message);
    }
}
