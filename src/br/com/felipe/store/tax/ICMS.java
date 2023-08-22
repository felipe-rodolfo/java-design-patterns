package br.com.felipe.store.tax;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {
    public ICMS(Tax other) {
        super(other);
    }

    @Override
    public BigDecimal performCalculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.08"));
    }
}
