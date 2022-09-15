package com.example.studentmanagmentsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Integer id;

    private String name;

    private String address;


}
