package br.com.felipe.store.tax;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {
     private Tax other;
     public Tax(Tax other) {
          this.other = other;
     }
     protected abstract BigDecimal performCalculate(Budget budget);

     public BigDecimal calculate(Budget budget){
          BigDecimal taxValue = performCalculate(budget);
          BigDecimal otherTaxValue = BigDecimal.ZERO;
          if(other != null){
               otherTaxValue = other.performCalculate(budget);
          }
          return taxValue.add(otherTaxValue);
     }
}
