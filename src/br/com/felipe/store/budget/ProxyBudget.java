package br.com.felipe.store.budget;

import java.math.BigDecimal;

public class ProxyBudget extends Budget{

    private BigDecimal value;
    private Orcable budget;

    public ProxyBudget(Orcable budget){
        this.budget = budget;
    }

    public BigDecimal getValue(){
        if(value == null){
            this.value = budget.getValue();
        }
        return this.value;
    }

}
