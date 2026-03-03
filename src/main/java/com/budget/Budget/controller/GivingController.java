package com.budget.Budget.controller;

import com.budget.Budget.model.BudgetEntry;
import com.budget.Budget.service.GivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/giving")
@CrossOrigin(origins = "http://localhost:5173")
public class GivingController {

    @Autowired
    private GivingService givingService;

    @GetMapping("/getGivingByYearMonth")
    public ResponseEntity<List<BudgetEntry>> getGivingByYearMonth(@RequestParam Integer year, @RequestParam Integer month) {
        return new ResponseEntity<>(givingService.getGivingByYearMonth(year, month), HttpStatus.OK);
    }

    @PostMapping("/setGiving")
    public ResponseEntity<String> setGiving(@RequestBody BudgetEntry budgetEntry) {
        try {
            return new ResponseEntity<>(givingService.setGiving(budgetEntry), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Save failed due to " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
