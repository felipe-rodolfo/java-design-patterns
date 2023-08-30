package br.com.felipe.store.order.actions;

import br.com.felipe.store.order.Order;

public class OrderLog implements ActionAfterOrderGenerate{
    @Override
    public void executeAction(Order order) {
        System.out.println("Order did" + order);
    }
}
