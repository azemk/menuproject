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
    private String pictureUrlC;

    public Category() {
    }

    public Category( String category, String picture) {
        this.category = category;
        this.pictureUrlC = picture;
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

    public String getPictureUrlC() {
        return pictureUrlC;
    }

    public void setPictureUrlC(String pictureUrlC) {
        this.pictureUrlC = pictureUrlC;
    }
}
