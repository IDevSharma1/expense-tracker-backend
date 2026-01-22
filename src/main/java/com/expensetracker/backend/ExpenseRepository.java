package com.expensetracker.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{
	// This interface gives us methods like .save(), .findAll(), .deleteById() automatically!
}
