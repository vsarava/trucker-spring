package com.service.serviceImp;

import com.entity.Vehicle;
import com.repository.VehicleRepository;
import com.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Service
public class VehicleServiceImp implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> putVehicleData(List<Vehicle> vehicleData) {
        return vehicleRepository.putVehicleData(vehicleData);
    }

    @Override
    public List<Vehicle> getVehicles() {
        return vehicleRepository.getVehicles();
    }

    @Override
    public Vehicle getVehicleByVin(String vin) {
        return vehicleRepository.getVehicleByVin(vin);
    }
}
