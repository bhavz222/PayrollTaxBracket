#PayrollTaxBracket

PayrollTaxBracket is a Spring Boot REST API that calculates an employee’s net salary using progressive tax brackets and contractor deductions.
The application applies different tax rates based on the gross salary and deducts an additional flat professional fee for contractors.

---

##Features
- Progressive tax calculation:
  - Salary ≤ 3000 → 10% tax  
  - Salary between 3001 and 7000 → 15% tax  
  - Salary > 7000 → 20% tax  
- Additional $100 deduction for contractors  
- RESTful API with JSON request and response  
- Input validation using Jakarta Validation  
- Easy to test using Postman  

---

##API Endpoint

**POST** `/api/payroll/calculate`

###Example Request
```json
{
  "grossSalary": 6000,
  "contractor": false
}
##Response
{
  "tax": 900.0,
  "netSalary": 5100.0
}
