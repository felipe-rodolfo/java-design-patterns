package br.com.felipe.store.order;

import br.com.felipe.store.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {

    public void execute(GenerateOrder orderData){
        Budget budget = new Budget(orderData.getBudgetValue(), orderData.getItensQuantity());
        Order order = new Order(orderData.getClient(), LocalDateTime.now(), budget);

        System.out.println("Saving Order in DataBase");
        System.out.println("Send email with order info");
    }
}
