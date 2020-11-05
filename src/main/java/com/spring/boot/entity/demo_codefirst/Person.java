package com.spring.boot.entity.demo_codefirst;

import com.spring.boot.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends BaseEntity {
    private String name;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    @Column(name = "first_name",nullable = false,unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
