package br.com.felipe.store.status;

import br.com.felipe.store.DomainException;
import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetStatus{

    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finished(Budget budget) {
        budget.setStatus(new Finished());
    }
}
