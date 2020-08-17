package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescriptionID;
    private String content;
    @Column(name = "appointment_id")
    private Long appointmentId;

//    @ManyToOne
//    private Appointment appointment;

}
