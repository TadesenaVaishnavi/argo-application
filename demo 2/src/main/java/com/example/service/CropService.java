package com.project.farmapp.service;

import com.project.farmapp.entity.Crop;
import com.project.farmapp.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropService {

    @Autowired
    private CropRepository repo;

    public Crop save(Crop crop) {
        return repo.save(crop);
    }

    public List<Crop> getByFarmer(Long farmerId) {
        return repo.findByFarmerId(farmerId);
    }
}