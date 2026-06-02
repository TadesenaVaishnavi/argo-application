package com.project.farmapp.controller;

import com.project.farmapp.entity.Expense;
import com.project.farmapp.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profit")
public class ProfitController {

    @Autowired
    private ExpenseRepository repo;

    @PostMapping("/{expenseId}")
    public String calculate(@PathVariable Long expenseId,
                            @RequestBody double revenue) {

        Expense e = repo.findById(expenseId).orElseThrow();

        double profit = revenue - e.getTotalCost();

        return "Investment: " + e.getTotalCost() + " Profit: " + profit;
    }
}