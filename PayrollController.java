package com.payroll.controller;


import com.payroll.dto.PayrollRequest;
import com.payroll.dto.PayrollResponse;
import com.payroll.service.PayrollService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payroll")
@CrossOrigin(origins = "*")
public class PayrollController {

    private final PayrollService payrollService;

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping("/calculate")
    public PayrollResponse calculate(@Valid @RequestBody PayrollRequest request) {
        return payrollService.calculate(request);
    }
}
