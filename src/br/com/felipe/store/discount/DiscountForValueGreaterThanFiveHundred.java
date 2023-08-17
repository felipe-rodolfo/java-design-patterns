package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForValueGreaterThanFiveHundred extends Discount {

    public DiscountForValueGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if(budget.getValue().compareTo(new BigDecimal("500")) > 0){
            return budget.getValue().multiply((new BigDecimal("0.1")));
        }
        return next.calculate(budget);
    }
}
