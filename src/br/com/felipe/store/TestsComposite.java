package br.com.felipe.store;

import br.com.felipe.store.budget.Budget;
import br.com.felipe.store.budget.BudgetItem;

import java.math.BigDecimal;

public class TestsComposite {
    public static void main(String[] args) {
        Budget old = new Budget();
        old.addItem(new BudgetItem(new BigDecimal("200")));

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("500")));
        newBudget.addItem(old);
    }
}
