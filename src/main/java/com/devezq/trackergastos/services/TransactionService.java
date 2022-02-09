package com.devezq.trackergastos.services;

import com.devezq.trackergastos.domain.Transaction;
import com.devezq.trackergastos.exceptions.TgBadRequestException;
import com.devezq.trackergastos.exceptions.TgResourceNotFoundException;

import java.util.List;

public interface TransactionService {

    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws TgResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws TgBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws TgBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws TgResourceNotFoundException;
}
