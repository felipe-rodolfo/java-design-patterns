//package br.com.felipe.store.tax;
//
//import br.com.felipe.store.budget.Budget;
//
//import java.math.BigDecimal;
//
//public class ICMSWithISS implements Tax {
//
//
//    @Override
//    public BigDecimal calculate(Budget budget) {
//        BigDecimal icms = new ICMS().calculate(budget);
//        BigDecimal iss = new ISS().calculate(budget);
//        return icms.add(iss)
//    }
//}
