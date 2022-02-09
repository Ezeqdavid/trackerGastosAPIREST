package com.devezq.trackergastos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class TgAuthException extends RuntimeException {

    public TgAuthException(String message) {
        super(message);
    }
}
