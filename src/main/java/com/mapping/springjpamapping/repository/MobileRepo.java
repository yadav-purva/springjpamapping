package com.mapping.springjpamapping.repository;

import com.mapping.springjpamapping.entities.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepo extends JpaRepository<Mobile,Integer> {
}
