package com.tutul.databaseConnection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    public String name;
    public String category;
    public float price;
    public String description;
    public int quantity;
    public float rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
