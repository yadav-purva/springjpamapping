package com.mapping.springjpamapping.controller;
import com.mapping.springjpamapping.entities.address;
import com.mapping.springjpamapping.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/addresses")
public class AddressController {
        @Autowired
        private AddressServiceImpl addressService;

        // Create a new Address
        @PostMapping
        public address createAddress(@RequestBody address address) {
            return addressService.saveAddress(address);
        }

        // Get Address by ID
        @GetMapping("/{id}")
        public address getAddress(@PathVariable Integer id) {
            return addressService.getAddressById(id);
        }
    }




