package com.payroll.service;



import com.payroll.dto.PayrollRequest;
import com.payroll.dto.PayrollResponse;
import org.springframework.stereotype.Service;

@Service
public class PayrollService {

    public PayrollResponse calculate(PayrollRequest request) {

        double salary = request.getGrossSalary();
        double taxRate;

        if (salary <= 3000) taxRate = 0.10;
        else if (salary <= 7000) taxRate = 0.15;
        else taxRate = 0.20;

        double tax = salary * taxRate;
        double netSalary = salary - tax;

        if (request.isContractor()) netSalary -= 100;

        return new PayrollResponse(tax, netSalary);
    }
}
