package com.devezq.trackergastos.domain;

import lombok.Getter;
import lombok.Setter;

public class Transaction {
    @Getter @Setter private Integer transactionId;
    @Getter @Setter private Integer categoryId;
    @Getter @Setter private Integer userId;
    @Getter @Setter private Double amount;
    @Getter @Setter private String note;
    @Getter @Setter private Long transactionDate;

    public Transaction(Integer transactionId, Integer categoryId, Integer userId, Double amount, String note, Long transactionDate) {
        this.transactionId = transactionId;
        this.categoryId = categoryId;
        this.userId = userId;
        this.amount = amount;
        this.note = note;
        this.transactionDate = transactionDate;
    }
}
