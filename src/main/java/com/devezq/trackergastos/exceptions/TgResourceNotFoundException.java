package com.devezq.trackergastos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TgResourceNotFoundException extends RuntimeException{

    public TgResourceNotFoundException(String message){
        super(message);
    }
}
