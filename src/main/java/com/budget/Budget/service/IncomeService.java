package com.budget.Budget.service;

import com.budget.Budget.model.DBIncome;
import com.budget.Budget.model.Income;
import com.budget.Budget.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getIncomeByYearMonth(Integer year, Integer month) {
        List<DBIncome> dbIncomes = incomeRepository.findAll().stream().filter(income ->Objects.equals(income.getYear(), year) && Objects.equals(income.getMonth(), month)).toList();
        List<Income> incomes = new ArrayList<>();

        dbIncomes.forEach(dbIncome -> {
            Income income = new Income(
                    dbIncome.getTitle(),
                    dbIncome.getPlannedAmount(),
                    dbIncome.getRemainingAmounnt(),
                    dbIncome.getYear(),
                    dbIncome.getMonth(),
                    dbIncome.getDay());

            incomes.add(income);
        });

        return incomes;
    }

    public String setIncome(Income income) {
        try {
            DBIncome dbIncome = new DBIncome();
            dbIncome.setTitle(income.getTitle());
            dbIncome.setPlannedAmount(income.getPlannedAmount());
            dbIncome.setRemainingAmounnt(income.getRemainingAmount());
            dbIncome.setYear(income.getYear());
            dbIncome.setMonth(income.getMonth());
            dbIncome.setDay(income.getDay());

            incomeRepository.save(dbIncome);

            return income.getTitle() + " added for " + income.getMonth() + "/" + income.getDay() + "/" + income.getYear();
        } catch (Exception e) {
            return "Save failed due to " +  e.getMessage();
        }
    }
}
