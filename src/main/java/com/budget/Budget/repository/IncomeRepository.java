package com.budget.Budget.repository;

import com.budget.Budget.model.Income;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IncomeRepository {
    private final List<Income> incomes =  new ArrayList<>();

    public IncomeRepository() {
        Income income1 = new Income("Income 1", "159.00", "159.00", 2026, 2, 1);
        Income income2 = new Income("Income 2", "159.00", "159.00", 2026, 2, 15);

        incomes.add(income1);
        incomes.add(income2);
    }

    public List<Income> getIncomeByYearMonth(Integer year, Integer month) {
        return incomes.stream().filter(income -> ((income.getYear() == year) && (income.getMonth() == month))).toList();
    }

    public void setIncomeByYearMonth(Income income) {
        incomes.add(income);
    }
}
