package com.mapping.springjpamapping.repository;

import com.mapping.springjpamapping.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Integer> {


}
