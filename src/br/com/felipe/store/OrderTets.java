package br.com.felipe.store;

import br.com.felipe.store.budget.Budget;
import br.com.felipe.store.order.GenerateOrder;
import br.com.felipe.store.order.GenerateOrderHandler;
import br.com.felipe.store.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderTets {
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int itensQuantity = Integer.parseInt(args[2]);

        GenerateOrder order = new GenerateOrder(client,budgetValue,itensQuantity);
        GenerateOrderHandler handler = new GenerateOrderHandler(/*dependency*/);
        handler.execute(order);
    }
}
