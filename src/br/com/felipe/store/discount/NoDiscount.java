package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }
    @Override
    protected BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean isApplicable(Budget budget) {
        return true;
    }
}
