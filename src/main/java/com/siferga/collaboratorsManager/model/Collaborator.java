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


}
