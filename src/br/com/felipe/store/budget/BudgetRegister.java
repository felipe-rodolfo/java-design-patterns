package br.com.felipe.store.budget;

import br.com.felipe.store.DomainException;
import br.com.felipe.store.http.HttpAdapter;

import java.util.Map;

public class BudgetRegister {
    private HttpAdapter http;

    public BudgetRegister(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget){
        if(!budget.isFinished()){
            throw  new DomainException("Budget not finished");
        }

        String url = "http://api.external/budget";
        Map<String, Object> data = Map.of(
                "valor", budget.getValue(),
                "ItemsQuantity", budget.getItemsQuantity()
        );
        http.post(url, data);

    }
}
