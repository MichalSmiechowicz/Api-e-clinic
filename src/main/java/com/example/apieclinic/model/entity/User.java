package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;
    private String name;
    private String surname;
    private String pesel;
    private Date birthDate;
    private String address;
    private String phone;
    private String email;
    private String password;
    private String gender;
    private String chronicDiseases;
    private String avatarPath;

}
