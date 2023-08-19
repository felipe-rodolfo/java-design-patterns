package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForValueGreaterThanFiveHundred extends Discount {

    public DiscountForValueGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Budget budget){
        return budget.getValue().multiply((new BigDecimal("0.1")));
    }

    @Override
    public boolean isApplicable(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
