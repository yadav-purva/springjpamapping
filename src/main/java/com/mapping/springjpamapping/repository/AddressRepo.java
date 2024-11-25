package com.mapping.springjpamapping.repository;

import com.mapping.springjpamapping.entities.address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<address,Integer> {
}
