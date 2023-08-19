package br.com.felipe.store.order.actions;

import br.com.felipe.store.order.Order;

public interface ActionAfterOrderGenerate {
    public void executeAction(Order order);
}
