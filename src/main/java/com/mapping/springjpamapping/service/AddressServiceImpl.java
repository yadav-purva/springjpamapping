package com.mapping.springjpamapping.service;

import com.mapping.springjpamapping.entities.address;
import com.mapping.springjpamapping.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddressServiceImpl {
        @Autowired
        private AddressRepo addressRepo;

        public address saveAddress(address address) {
            return addressRepo.save(address);
        }

        public address getAddressById(Integer id) {
            return addressRepo.findById(id).orElse(null);
        }
    }



