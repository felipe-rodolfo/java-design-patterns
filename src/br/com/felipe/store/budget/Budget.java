package br.com.felipe.store.budget;

import br.com.felipe.store.status.BudgetStatus;
import br.com.felipe.store.status.Finished;
import br.com.felipe.store.status.UnderReview;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int itemsQuantity;
    private BudgetStatus status;
    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity = itemsQuantity;
        this.status = new UnderReview();
    }

    public void applyExtraDiscount(){
        BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve(){
        this.status.toApprove(this);
    }

    public void repprove(){
        this.status.reprove(this);
    }

    public void finished(){
        this.status.finished(this);
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setStatus(BudgetStatus newStatus) {
        status = newStatus;
    }

    public boolean isFinished() {
        return status instanceof Finished;
    }
}
