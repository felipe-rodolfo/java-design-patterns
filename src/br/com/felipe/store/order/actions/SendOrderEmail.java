package br.com.felipe.store.order.actions;

import br.com.felipe.store.order.Order;

public class SendOrderEmail implements ActionAfterOrderGenerate{
    public void executeAction(Order order){
        System.out.println("Sending email order");
    }
}
