package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    public BigDecimal calculate(Budget budget){
        return BigDecimal.ZERO;
    }
}
