package com.mapping.springjpamapping.controller;

import com.mapping.springjpamapping.entities.Emp;
import com.mapping.springjpamapping.entities.Mobile;
import com.mapping.springjpamapping.entities.address;
import com.mapping.springjpamapping.service.Services;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mapping")
public class MyController {
    private Services service;
    public MyController(Services service){
        this.service=service;
    }
 /*   @PostMapping("/mobile")
    public Mobile addMobile(@RequestBody Mobile mobile){
        return service.addMobile(mobile);
    }*/

  /*  @PostMapping("/address")
    public address createAddress(@RequestBody address addr){
        return service.saveAddress(addr);
    }*/

   /* @PostMapping("/employee")
    public Emp addEmp(@RequestBody Emp emp){
        return service.addEmp(emp);
    }*/

}
