package com.repository;

import com.entity.Vehicle;

import java.util.List;

public interface VehicleRepository {

    List<Vehicle> findAll();
}