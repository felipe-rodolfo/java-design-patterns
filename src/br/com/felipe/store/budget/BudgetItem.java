package br.com.felipe.store.budget;

import java.math.BigDecimal;

public class BudgetItem implements Orcable{
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public BudgetItem(BigDecimal value) {
        this.value = value;
    }
}
