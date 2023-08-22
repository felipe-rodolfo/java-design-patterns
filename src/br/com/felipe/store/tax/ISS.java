package br.com.felipe.store.tax;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class ISS extends Tax {
    public ISS(Tax other) {
        super(other);
    }

    public BigDecimal performCalculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
