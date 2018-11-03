package com.repository;

import com.entity.Vehicle;

import java.util.List;

public interface VehicleRepository {

    List<Vehicle> putVehicleData(List<Vehicle> vehicleData);
    List<Vehicle> getVehicles();
    Vehicle getVehicleByVin(String vin);
}
