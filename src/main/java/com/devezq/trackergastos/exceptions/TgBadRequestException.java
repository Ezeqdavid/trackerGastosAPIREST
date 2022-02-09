package com.devezq.trackergastos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TgBadRequestException extends RuntimeException {
    public TgBadRequestException(String message) {
        super(message);
    }
}
