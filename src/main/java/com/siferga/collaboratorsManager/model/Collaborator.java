package com.siferga.collaboratorsManager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Collaborator implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String colPhone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String colCode;


    public Collaborator() {
    }
    public Collaborator(String name, String email, String jobTitle, String colPhone, String imageUrl, String colCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.colPhone = colPhone;
        this.imageUrl = imageUrl;
        this.colCode = colCode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getColPhone() {
        return colPhone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getColCode() {
        return colCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setColPhone(String colPhone) {
        this.colPhone = colPhone;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setColCode(String colCode) {
        this.colCode = colCode;
    }


}
