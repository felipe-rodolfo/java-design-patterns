package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForMoreFiveItems extends Discount {
    public DiscountForMoreFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if(budget.getItemsQuantity() > 5){
            return budget.getValue().multiply((new BigDecimal("0.1")));
        }
        return next.calculate(budget);
    }
}
