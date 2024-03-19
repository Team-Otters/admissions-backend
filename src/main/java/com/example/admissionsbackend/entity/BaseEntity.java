package com.example.admissionsbackend.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;
@MappedSuperclass


public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Boolean isStopped = false;
}
