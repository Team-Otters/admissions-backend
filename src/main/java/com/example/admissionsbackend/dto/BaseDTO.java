package com.example.admissionsbackend.dto;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

public class BaseDTO {
    private String id;
    private Date createdDate;
    private Date modifiedDate;
    private String createdBy;
    private String modifiedBy;
}
