package com.devezq.trackergastos.repository;

import com.devezq.trackergastos.domain.User;
import com.devezq.trackergastos.exceptions.TgAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws TgAuthException;

    User findByEmailAndPassword(String email, String password) throws TgAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userID);
}
