package com.example.demorest.model;

import jakarta.persistence.*;

@Entity
@Table(name="demo_rest_table")
public class demoModel {
    @Id
    private Long id;
    private String name;

    private int age;
    public demoModel() {
    }
    public demoModel(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
