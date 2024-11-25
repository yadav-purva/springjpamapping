package com.mapping.springjpamapping.entities;

import jakarta.persistence.*;

@Entity
public class address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String street;
        private String city;
        private String zipCode;

        @ManyToOne
        @JoinColumn(name = "employee_id")
        private Emp employee;

        // Constructors, Getters and Setters
        public address() {}

        public address(String street, String city, String zipCode, Emp employee) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
            this.employee = employee;
        }

        // Getters and Setters...
    }





