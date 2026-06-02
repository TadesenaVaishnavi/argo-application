package com.project.farmapp.repository;

import com.project.farmapp.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
    Optional<Farmer> findByMobileNumber(String mobileNumber);
}