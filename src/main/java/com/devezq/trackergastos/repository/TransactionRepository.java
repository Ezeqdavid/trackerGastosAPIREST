package com.devezq.trackergastos.repository;

import com.devezq.trackergastos.domain.Transaction;
import com.devezq.trackergastos.exceptions.TgBadRequestException;
import com.devezq.trackergastos.exceptions.TgResourceNotFoundException;

import java.util.List;

public interface TransactionRepository {

    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws TgResourceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactinoDate) throws TgBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws TgBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws TgResourceNotFoundException;
}
