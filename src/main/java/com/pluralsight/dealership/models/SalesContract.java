package com.pluralsight.dealership.models;

public class SalesContract {
    private Vehicle vehicle;
    private String customerName;
    private String email;
    private double totalPrice;
    private double monthlyPayment;
    private String date;

    public SalesContract() {}

    public SalesContract(Vehicle vehicle, String customerName, String email, double totalPrice, double monthlyPayment, String date) {
        this.vehicle = vehicle;
        this.customerName = customerName;
        this.email = email;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
        this.date = date;
    }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public double getMonthlyPayment() { return monthlyPayment; }
    public void setMonthlyPayment(double monthlyPayment) { this.monthlyPayment = monthlyPayment; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
