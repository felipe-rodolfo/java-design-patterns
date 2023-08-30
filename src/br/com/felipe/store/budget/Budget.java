package br.com.felipe.store.budget;

import br.com.felipe.store.status.BudgetStatus;
import br.com.felipe.store.status.Finished;
import br.com.felipe.store.status.UnderReview;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Orcable{
    private BigDecimal value;
    private BudgetStatus status;
    private List<Orcable> items = new ArrayList<>();
    public Budget() {
        this.value = BigDecimal.ZERO;
        this.items = new ArrayList<>();
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
        return items.size();
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

    public void addItem(Orcable item){
        this.value = value.add(item.getValue());
        this.items.add(item);
    }
}
