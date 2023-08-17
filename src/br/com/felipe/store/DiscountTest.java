package br.com.felipe.store;

import br.com.felipe.store.budget.Budget;
import br.com.felipe.store.discount.DiscountCalculator;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Budget first = new Budget(new BigDecimal("100"), 6);
        Budget second = new Budget(new BigDecimal("550"), 4);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(first));
        System.out.println(calculator.calculate(second));
    }
}
