package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentID;
    private Timestamp dateTime;
    private Integer price;
    private Integer type;
    private String diagnosis;
    private String recommendations;
//    @ManyToOne
//    private User user;
    @ManyToOne
    private Doctor doctor;
}
