package com.budget.Budget.controller;

import com.budget.Budget.model.BudgetEntry;
import com.budget.Budget.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/income")
@CrossOrigin(origins = "http://localhost:5173")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @GetMapping("/getIncomeByYearMonth")
    public ResponseEntity<List<BudgetEntry>> getIncomeByYearMonth(@RequestParam Integer year, @RequestParam Integer month) {
        return new ResponseEntity<>(incomeService.getIncomeByYearMonth(year, month), HttpStatus.OK);
    }

    @PostMapping("/setIncome")
    public ResponseEntity<String> setIncome(@RequestBody BudgetEntry budgetEntry) {
        try {
            return new ResponseEntity<>(incomeService.setIncome(budgetEntry), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Save failed due to " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
