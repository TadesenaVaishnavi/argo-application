package com.project.farmapp.service;

import com.project.farmapp.entity.Expense;
import com.project.farmapp.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repo;

    public Expense save(Expense e) {

        double total = e.getSeedCost() +
                e.getFertilizerCost() +
                e.getLaborCost() +
                e.getWaterCost() +
                e.getMachineryCost() +
                e.getTransportCost() +
                e.getMiscCost();

        e.setTotalCost(total);

        return repo.save(e);
    }
}