package com.budget.Budget.controller;

import com.budget.Budget.model.BudgetEntry;
import com.budget.Budget.service.SpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/spending")
@CrossOrigin(origins = "http://localhost:5173")
public class SpendingController {

    @Autowired
    private SpendingService spendingService;

    @GetMapping("/getSpendingByYearMonth")
    public ResponseEntity<List<BudgetEntry>> getSpendingByYearMonth(@RequestParam Integer year, @RequestParam Integer month) {
        return new ResponseEntity<>(spendingService.getSpendingByYearMonth(year, month), HttpStatus.OK);
    }

    @PostMapping("/setSpending")
    public ResponseEntity<String> setSpending(@RequestBody BudgetEntry budgetEntry) {
        try {
            return new ResponseEntity<>(spendingService.setSpending(budgetEntry), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Save failed due to " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
