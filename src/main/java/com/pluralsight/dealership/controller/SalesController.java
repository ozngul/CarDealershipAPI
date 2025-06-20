package com.pluralsight.dealership.controller;

import com.pluralsight.dealership.dao.SalesContractDao;
import com.pluralsight.dealership.models.SalesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sales-contracts")
public class SalesController {

    @Autowired
    private SalesContractDao salesContractDao;

    @PostMapping
    public ResponseEntity<String> addSalesContract(@RequestBody SalesContract contract) {
        salesContractDao.save(contract);
        return ResponseEntity.ok("Satış kontratı eklendi.");
    }
}
