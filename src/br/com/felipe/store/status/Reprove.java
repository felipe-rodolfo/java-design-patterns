package br.com.felipe.store.status;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class Reprove extends BudgetStatus {
    @Override
    public void finished(Budget budget) {
        budget.setStatus(new Finished());
    }
}
