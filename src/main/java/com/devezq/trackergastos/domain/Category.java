package com.devezq.trackergastos.domain;

import lombok.Getter;
import lombok.Setter;

public class Category {
    @Getter @Setter private Integer categoryId;
    @Getter @Setter private Integer userId;
    @Getter @Setter private String title;
    @Getter @Setter private String description;
    @Getter @Setter private Double totalExpense;

    public Category(Integer categoryId, Integer userId, String title, String description, Double totalExpense) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.totalExpense = totalExpense;
    }
}
