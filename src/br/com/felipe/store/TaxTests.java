package br.com.felipe.store;

import br.com.felipe.store.budget.Budget;
import br.com.felipe.store.tax.TaxCalculator;
import br.com.felipe.store.tax.TaxType;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, TaxType.ICMS));
    }
}
