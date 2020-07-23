package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long doctorID;
    private String name;
    private String surname;
    private String pesel;
    private Date birthDate;
    private String phone;
    private String email;
    private String password;
    private String specialization;
    private String description;
    private String avatarPath;

}
