package com.pluralsight.dealership.controller;

import com.pluralsight.dealership.dao.LeaseContractDao;
import com.pluralsight.dealership.models.LeaseContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lease-contracts")
public class LeaseController {

    @Autowired
    private LeaseContractDao leaseContractDao;

    @PostMapping
    public ResponseEntity<String> addLeaseContract(@RequestBody LeaseContract contract) {
        leaseContractDao.save(contract);
        return ResponseEntity.ok("Kiralama kontratı eklendi.");
    }
}
