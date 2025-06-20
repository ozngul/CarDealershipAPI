package com.pluralsight.dealership.controller;

import com.pluralsight.dealership.dao.VehicleDao;
import com.pluralsight.dealership.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleDao vehicleDao;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleDao.getAllVehicles();
    }

    @PostMapping
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) {
        vehicleDao.addVehicle(vehicle);
        return ResponseEntity.ok("Araç eklendi.");
    }

    @DeleteMapping("/{vin}")
    public ResponseEntity<String> deleteVehicle(@PathVariable String vin) {
        vehicleDao.removeVehicle(vin);
        return ResponseEntity.ok("Araç silindi.");
    }
}
