package com.budget.Budget.service;

import com.budget.Budget.enums.BudgetType;
import com.budget.Budget.model.DBBudgetEntry;
import com.budget.Budget.model.BudgetEntry;
import com.budget.Budget.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class IncomeService {
    @Autowired
    private GenericRepository genericRepository;

    public List<BudgetEntry> getIncomeByYearMonth(Integer year, Integer month) {
        List<DBBudgetEntry> dbBudgetEntries =
                genericRepository.findAll()
                        .stream()
                        .filter(
                                budgetEntry -> Objects.equals(budgetEntry.getBudgetType(), BudgetType.Income.toString()) && Objects.equals(budgetEntry.getYear(), year) && Objects.equals(budgetEntry.getMonth(), month)).toList();
        List<BudgetEntry> budgetEntries = new ArrayList<>();

        dbBudgetEntries.forEach(dbBudgetEntry -> {
            BudgetEntry budgetEntry = new BudgetEntry(
                    dbBudgetEntry.getTitle(),
                    dbBudgetEntry.getBudgetType(),
                    dbBudgetEntry.getPlannedAmount(),
                    dbBudgetEntry.getReceivedAmount(),
                    dbBudgetEntry.getYear(),
                    dbBudgetEntry.getMonth(),
                    dbBudgetEntry.getDay());

            budgetEntries.add(budgetEntry);
        });

        return budgetEntries;
    }

    public String setIncome(BudgetEntry budgetEntry) {
        try {
            DBBudgetEntry dbBudgetEntry = new DBBudgetEntry();
            dbBudgetEntry.setTitle(budgetEntry.getTitle());
            dbBudgetEntry.setBudgetType(BudgetType.Income.toString());
            dbBudgetEntry.setPlannedAmount(budgetEntry.getPlannedAmount());
            dbBudgetEntry.setReceivedAmount(budgetEntry.getReceivedAmount());
            dbBudgetEntry.setYear(budgetEntry.getYear());
            dbBudgetEntry.setMonth(budgetEntry.getMonth());
            dbBudgetEntry.setDay(budgetEntry.getDay());

            genericRepository.save(dbBudgetEntry);

            return budgetEntry.getTitle() + " added for " + budgetEntry.getMonth() + "/" + budgetEntry.getDay() + "/" + budgetEntry.getYear();
        } catch (Exception e) {
            return "Save failed due to " +  e.getMessage();
        }
    }
}
