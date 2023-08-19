package br.com.felipe.store.order;

import br.com.felipe.store.budget.Budget;
import br.com.felipe.store.order.actions.ActionAfterOrderGenerate;
import br.com.felipe.store.order.actions.SendOrderEmail;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionAfterOrderGenerate> actions;

    public GenerateOrderHandler(List<ActionAfterOrderGenerate> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder orderData){
        Budget budget = new Budget(orderData.getBudgetValue(), orderData.getItensQuantity());
        Order order = new Order(orderData.getClient(), LocalDateTime.now(), budget);

        actions.forEach(actionOrder -> actionOrder.executeAction(order));
    }
}
