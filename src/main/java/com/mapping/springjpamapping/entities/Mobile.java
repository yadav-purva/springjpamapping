package com.mapping.springjpamapping.entities;

import jakarta.persistence.*;

@Entity

public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mobileName;

    /*@OneToOne
    private Emp emp;*/

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMobileName() {
        return mobileName;
    }
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }
}
