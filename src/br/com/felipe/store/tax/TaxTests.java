package br.com.felipe.store.tax;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();
        System.out.println(calculator.calculate(budget, new ISS(new ICMS(null))));
    }
}
