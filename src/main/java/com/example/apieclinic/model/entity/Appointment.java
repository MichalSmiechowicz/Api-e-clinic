package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentID;
    private Timestamp dateTime;
    private Integer price;
    private Integer type;
    private String diagnosis;
    private String recommendations;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "doctor_id")
    private Long doctorId;
    @OneToMany(cascade = CascadeType.DETACH)
    @JoinColumn(name = "appointment_id")
    private Set<Prescription> prescriptions;
    @OneToMany(cascade = CascadeType.DETACH)
    @JoinColumn(name = "appointment_id")
    private Set<AttachedImage> attachedImages;
    @OneToMany(cascade = CascadeType.DETACH)
    @JoinColumn(name = "appointment_id")
    private Set<AttachedImage> SickLeaves;
//    @ManyToOne
//    private User user;
//    @ManyToOne
//    private Doctor doctor;
}
