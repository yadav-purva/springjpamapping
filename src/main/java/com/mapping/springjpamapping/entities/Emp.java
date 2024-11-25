package com.mapping.springjpamapping.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
private String empName;

@OneToOne
private  Mobile mobile;

@OneToMany(mappedBy = "emp",cascade = CascadeType.ALL, orphanRemoval = true)
private List<address> addresses;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public List<address> getAddresses() {
        return null;
    }
}
