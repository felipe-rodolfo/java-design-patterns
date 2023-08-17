package br.com.felipe.store.discount;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget){
        Discount discount = new DiscountForMoreFiveItems(
                new DiscountForValueGreaterThanFiveHundred(
                        new NoDiscount()));

        return discount.calculate(budget);
    }
}
