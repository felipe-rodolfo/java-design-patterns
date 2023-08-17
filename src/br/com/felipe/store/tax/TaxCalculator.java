package br.com.felipe.store.tax;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax){
       return tax.calculate((budget));
    }
}
