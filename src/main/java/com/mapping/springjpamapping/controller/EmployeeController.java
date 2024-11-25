package com.mapping.springjpamapping.controller;

import com.mapping.springjpamapping.entities.Emp;
import com.mapping.springjpamapping.entities.address;
import com.mapping.springjpamapping.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmpServiceImpl employeeService;

    // Create a new Employee
    @PostMapping
    public Emp createEmployee(@RequestBody Emp employee) {
        return employeeService.saveEmployee(employee);
    }

    // Get Employee by ID along with its addresses
    @GetMapping("/{id}")
    public Emp getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    // Get Addresses of a specific Employee
    @GetMapping("/{id}/addresses")
    public List<address> getAddresses(@PathVariable Integer id) {
        Emp employee = employeeService.getEmployeeById(id);
        return employee != null ? employee.getAddresses() : null;
    }
}

