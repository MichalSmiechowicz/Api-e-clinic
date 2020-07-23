package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prescriptionID;
    private String content;
    @ManyToOne
    private Appointment appointment;

}
