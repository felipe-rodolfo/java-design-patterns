package br.com.felipe.store.status;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public class UnderReview extends BudgetStatus{

    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void reprove(Budget budget) {
        budget.setStatus(new Reprove());
    }
    @Override
    public void toApprove(Budget budget) {
        budget.setStatus(new Approved());
    }
}
