package com.controller;

import com.entity.Vehicle;
import com.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicles")
@CrossOrigin(maxAge = 3600)
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.PUT)
    public List<Vehicle> putVehicleData(@RequestBody List<Vehicle> vehicleData){
        return vehicleService.putVehicleData(vehicleData);
    }


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> getVehicles(){

        return vehicleService.getVehicles();

    }
}
