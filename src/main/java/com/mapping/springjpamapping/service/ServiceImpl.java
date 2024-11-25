package com.mapping.springjpamapping.service;

import com.mapping.springjpamapping.entities.Emp;
import com.mapping.springjpamapping.entities.address;
import com.mapping.springjpamapping.repository.AddressRepo;
import com.mapping.springjpamapping.repository.EmpRepo;
import com.mapping.springjpamapping.repository.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl{
    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private MobileRepo mobileRepo;

    @Autowired
    private AddressRepo addressRepo;


  /* @Override
    public Mobile addMobile(Mobile mobile) {
        return mobileRepo.save(mobile);
    }*/


/*
    @Override
    public Emp addEmp(Emp emp) {
        return empRepo.save(emp);
    }*/

}
