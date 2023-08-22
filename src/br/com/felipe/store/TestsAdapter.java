package br.com.felipe.store;

import br.com.felipe.store.budget.Budget;
import br.com.felipe.store.budget.BudgetRegister;
import br.com.felipe.store.http.JavaHttpClient;

import java.math.BigDecimal;

public class TestsAdapter {
    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.approve();
        budget.repprove();

        BudgetRegister register = new BudgetRegister(new JavaHttpClient());
        register.register((budget));
    }
}
