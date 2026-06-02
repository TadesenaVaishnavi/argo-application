package com.project.farmapp.controller;

import com.project.farmapp.entity.Crop;
import com.project.farmapp.service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crops")
public class CropController {

    @Autowired
    private CropService service;

    @PostMapping
    public Crop addCrop(@RequestBody Crop crop) {
        return service.save(crop);
    }

    @GetMapping("/{farmerId}")
    public List<Crop> getCrops(@PathVariable Long farmerId) {
        return service.getByFarmer(farmerId);
    }
}