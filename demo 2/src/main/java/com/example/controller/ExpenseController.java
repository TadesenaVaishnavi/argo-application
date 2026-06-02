package com.project.farmapp.controller;

import com.project.farmapp.entity.Expense;
import com.project.farmapp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense addExpense(@RequestBody Expense e) {
        return service.save(e);
    }
}