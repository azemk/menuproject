package com.example.menu.model;

import javax.persistence.*;

@Entity
@Table(name ="PierreMenu")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    @Column (name ="name ",nullable = false)
    private String name ;
    @Column (name ="description",nullable = false,unique = true)
    private String description;
    @Column (name ="weigth",nullable=false)
    private String weight;
    @Column (name ="price",nullable=false)
    private Double price ;
    @Column(name ="picture")
    private String picture;
    @ManyToOne
    @JoinColumn(name="category",nullable = false)
    private Category category;

    public Item() {
    }

    public Item(String name, String description, String weight, Double price, String picture, Category category) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.picture = picture;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
