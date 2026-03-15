package com.budget.Budget.controller;

import com.budget.Budget.model.BudgetEntry;
import com.budget.Budget.service.SubscriptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subscriptions")
@CrossOrigin(origins = "http://localhost:5173")
public class SubscriptionsController {

    @Autowired
    private SubscriptionsService subscriptionsService;

    @GetMapping("/getSubscriptionsByYearMonth")
    public ResponseEntity<List<BudgetEntry>> getSubscriptionsByYearMonth(@RequestParam Integer year, @RequestParam Integer month) {
        return new ResponseEntity<>(subscriptionsService.getSubscriptionsByYearMonth(year, month), HttpStatus.OK);
    }

    @PostMapping("/setSubscriptions")
    public ResponseEntity<String> setSubscriptions(@RequestBody BudgetEntry budgetEntry) {
        try {
            return new ResponseEntity<>(subscriptionsService.setSubscriptions(budgetEntry), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Save failed due to " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
