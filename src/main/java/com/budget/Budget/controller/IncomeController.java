package com.budget.Budget.controller;

import com.budget.Budget.model.Income;
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
    public ResponseEntity<List<Income>> getIncomeByYearMonth(@RequestParam Integer year, @RequestParam Integer month) {
        return new ResponseEntity<>(incomeService.getIncomeByYearMonth(year, month), HttpStatus.OK);
    }
}
