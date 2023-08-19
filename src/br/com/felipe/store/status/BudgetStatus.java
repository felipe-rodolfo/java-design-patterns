package br.com.felipe.store.status;

import br.com.felipe.store.DomainException;
import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetStatus {
    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return BigDecimal.ZERO;
    }

    public void toApprove(Budget budget){
        throw new DomainException("Budget cannot approved");
    }

    public void reprove(Budget budget){
        throw new DomainException("Budget cannot be disapproved");
    }

    public void finished(Budget budget){
        throw new DomainException("Budget cannot be finished");
    }

}
