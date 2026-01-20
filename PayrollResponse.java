package com.payroll.dto;

public class PayrollResponse {
    private double tax;
    private double netSalary;

    public PayrollResponse(double tax, double netSalary) {
        this.tax = tax;
        this.netSalary = netSalary;
    }

    public double getTax() { return tax; }
    public double getNetSalary() { return netSalary; }
}

