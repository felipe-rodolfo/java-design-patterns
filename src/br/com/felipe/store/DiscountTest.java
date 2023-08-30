package br.com.felipe.store;

import br.com.felipe.store.budget.Budget;
import br.com.felipe.store.budget.BudgetItem;
import br.com.felipe.store.discount.DiscountCalculator;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Budget first = new Budget();
        first.addItem(new BudgetItem(new BigDecimal("200")));

        Budget second = new Budget();
        second.addItem(new BudgetItem(new BigDecimal("550")));

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(first));
        System.out.println(calculator.calculate(second));
    }
}
