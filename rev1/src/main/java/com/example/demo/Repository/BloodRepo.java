package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BloodModel;

public interface BloodRepo extends JpaRepository<BloodModel, Integer>{

}
