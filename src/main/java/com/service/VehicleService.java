package com.service;

import com.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> putVehicleData(List<Vehicle> vehicleData);
    List<Vehicle> getVehicles();
    Vehicle getVehicleByVin(String vin);
}
