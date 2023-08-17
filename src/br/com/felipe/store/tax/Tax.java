package br.com.felipe.store.tax;

import br.com.felipe.store.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
     BigDecimal calculate(Budget budget);
}
