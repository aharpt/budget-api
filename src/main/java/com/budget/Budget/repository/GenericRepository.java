package com.budget.Budget.repository;

import com.budget.Budget.model.DBBudgetEntry;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GenericRepository extends JpaRepository<DBBudgetEntry, Long> {
}
