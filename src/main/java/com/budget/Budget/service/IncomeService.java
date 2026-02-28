package com.budget.Budget.service;

import com.budget.Budget.model.Income;
import com.budget.Budget.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getIncomeByYearMonth(Integer year, Integer month) {
        return incomeRepository.getIncomeByYearMonth(year, month);
    }
}
