package com.budget.Budget.controller;

import com.budget.Budget.model.BudgetEntry;
import com.budget.Budget.service.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/debt")
@CrossOrigin(origins = "http://localhost:5173")
public class DebtController {

    @Autowired
    private DebtService debtService;

    @GetMapping("/getDebtByYearMonth")
    public ResponseEntity<List<BudgetEntry>> getDebtByYearMonth(@RequestParam Integer year, @RequestParam Integer month) {
        return new ResponseEntity<>(debtService.getDebtByYearMonth(year, month), HttpStatus.OK);
    }

    @PostMapping("/setDebt")
    public ResponseEntity<String> setDebt(@RequestBody BudgetEntry budgetEntry) {
        try {
            return new ResponseEntity<>(debtService.setDebt(budgetEntry), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Save failed due to " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
