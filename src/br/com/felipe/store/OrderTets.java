package br.com.felipe.store;
import br.com.felipe.store.order.GenerateOrder;
import br.com.felipe.store.order.GenerateOrderHandler;
import br.com.felipe.store.order.actions.SendOrderEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTets {
    public static void main(String[] args) {
        String client = "Brian D.";
        BigDecimal budgetValue = new BigDecimal(300);
        int itensQuantity = Integer.parseInt(String.valueOf(2));

        GenerateOrder order = new GenerateOrder(client,budgetValue,itensQuantity);
        GenerateOrderHandler handler = new GenerateOrderHandler(
                Arrays.asList(
                        new SendOrderEmail()
                )
        );
        handler.execute(order);
    }
}
