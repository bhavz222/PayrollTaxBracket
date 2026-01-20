package com.payroll.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class PayrollRequest {

    @NotNull
    @Min(0)
    private Double grossSalary;
    private boolean contractor;

    public Double getGrossSalary() { return grossSalary; }
    public void setGrossSalary(Double grossSalary) { this.grossSalary = grossSalary; }

    public boolean isContractor() { return contractor; }
    public void setContractor(boolean contractor) { this.contractor = contractor; }
}
