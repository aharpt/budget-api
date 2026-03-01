package com.budget.Budget.repository;

import com.budget.Budget.model.DBIncome;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IncomeRepository extends JpaRepository<DBIncome, Long> {
}
