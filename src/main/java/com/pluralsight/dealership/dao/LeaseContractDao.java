package com.pluralsight.dealership.dao;

import com.pluralsight.dealership.models.LeaseContract;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class LeaseContractDao {

    private final DataSource dataSource;

    public LeaseContractDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void save(LeaseContract contract) {
        String sql = "INSERT INTO lease_contracts (VIN, customer_name, customer_email, lease_price, monthly_payment, lease_date) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contract.getVehicle().getVin());
            stmt.setString(2, contract.getCustomerName());
            stmt.setString(3, contract.getEmail());
            stmt.setDouble(4, contract.getTotalPrice());
            stmt.setDouble(5, contract.getMonthlyPayment());
            stmt.setString(6, contract.getDate());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
