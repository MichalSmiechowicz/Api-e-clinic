package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

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
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_USERID")
    private Set<Appointment> appointments;

}
