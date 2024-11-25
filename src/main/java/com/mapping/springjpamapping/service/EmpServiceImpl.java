package com.mapping.springjpamapping.service;

import com.mapping.springjpamapping.entities.Emp;
import com.mapping.springjpamapping.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpServiceImpl {

    @Autowired
    private EmpRepo empRepo;

    public Emp saveEmployee(Emp employee) {
        return empRepo.save(employee);
    }

    public Emp getEmployeeById(Integer id) {
        return empRepo.findById(id).orElse(null);
    }

}
