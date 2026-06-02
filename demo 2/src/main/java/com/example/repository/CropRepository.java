package com.project.farmapp.repository;

import com.project.farmapp.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CropRepository extends JpaRepository<Crop, Long> {
    List<Crop> findByFarmerId(Long farmerId);
}