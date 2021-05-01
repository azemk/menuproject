package com.example.menu.model;

import javax.persistence.*;

@Entity
@Table(name ="categoryOfItems")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id ;
    @Column (name ="category",nullable = false,unique = true)
    private String category;
    @Column (name ="picture")
    private String picture;

    public Category() {
    }

    public Category( String category, String picture) {
        this.category = category;
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
