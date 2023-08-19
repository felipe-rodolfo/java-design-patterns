package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForMoreFiveItems extends Discount {
    public DiscountForMoreFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply((new BigDecimal("0.1")));
    }

    @Override
    public boolean isApplicable(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }
}
