package com.project.farmapp.service;

import com.project.farmapp.entity.Farmer;
import com.project.farmapp.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerService {

    @Autowired
    private FarmerRepository repo;

    public Farmer register(Farmer farmer) {
        return repo.save(farmer);
    }

    public Farmer login(String mobile, String password) {
        Farmer farmer = repo.findByMobileNumber(mobile)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!farmer.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return farmer;
    }
}