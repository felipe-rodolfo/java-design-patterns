package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }
    protected BigDecimal calculate(Budget budget){
        if(isApplicable((budget))){
            return performCalculation(budget);
        }
        return next.calculate(budget);
    }
    protected abstract BigDecimal performCalculation(Budget budget);

    public abstract boolean isApplicable(Budget budget);
}
