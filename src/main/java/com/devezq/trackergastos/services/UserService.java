package com.devezq.trackergastos.services;

import com.devezq.trackergastos.domain.User;
import com.devezq.trackergastos.exceptions.TgAuthException;

public interface UserService {

    User validateUser(String email, String password) throws TgAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws TgAuthException;
}
