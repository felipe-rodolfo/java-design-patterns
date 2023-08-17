package br.com.felipe.store.tax;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, TaxType taxType){
        switch (taxType){
            case ICMS:
                return budget.getValue().multiply(new BigDecimal("0.1"));
            case ISS:
                return budget.getValue().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;

        }
    }
}
