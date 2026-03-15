package com.budget.Budget.controller;

import com.budget.Budget.model.BudgetEntry;
import com.budget.Budget.service.SavingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/savings")
@CrossOrigin(origins = "http://localhost:5173")
public class SavingsController {

    @Autowired
    private SavingsService savingsService;

    @GetMapping("/getSavingsByYearMonth")
    public ResponseEntity<List<BudgetEntry>> getSavingsByYearMonth(@RequestParam Integer year, @RequestParam Integer month) {
        return new ResponseEntity<>(savingsService.getSavingsByYearMonth(year, month), HttpStatus.OK);
    }

    @PostMapping("/setSavings")
    public ResponseEntity<String> setSavings(@RequestBody BudgetEntry budgetEntry) {
        try {
            return new ResponseEntity<>(savingsService.setSavings(budgetEntry), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Save failed due to " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
