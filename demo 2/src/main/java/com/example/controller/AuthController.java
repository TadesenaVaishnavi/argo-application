package com.project.farmapp.controller;

import com.project.farmapp.entity.Farmer;
import com.project.farmapp.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private FarmerService service;

    @PostMapping("/register")
    public Farmer register(@RequestBody Farmer farmer) {
        return service.register(farmer);
    }

    @PostMapping("/login")
    public Farmer login(@RequestBody Map<String, String> data) {
        return service.login(data.get("mobile"), data.get("password"));
    }
}