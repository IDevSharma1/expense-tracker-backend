package com.expensetracker.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*") // Allows React to access this API

public class ExpenseController {
	
	@Autowired
	private ExpenseRepository repository;
	
	@GetMapping
	public List<Expense> getAllExpenses() {
		return repository.findAll();
	}
	
	@PostMapping
	public Expense createExpense(@RequestBody Expense expense) {
		return repository.save(expense);
	}
	
	@DeleteMapping("/{id}")
	public void deleteExpense(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
