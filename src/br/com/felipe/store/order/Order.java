package br.com.felipe.store.order;

import br.com.felipe.store.budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String client;
    private LocalDateTime date;
    private Budget budget;

    public Order(String client, LocalDateTime date, Budget budget) {
        this.client = client;
        this.date = date;
        this.budget = budget;
    }

    public Budget getBudget() {
        return budget;
    }
}
