package com.mehrez.appdockerizationdemo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class DemoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public DemoEntity() {
    }

    @Column
    private String name;

    @Column
    private String description;

    public DemoEntity (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
