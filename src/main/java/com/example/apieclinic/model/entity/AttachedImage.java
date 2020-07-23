package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "attached_images")
public class AttachedImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageID;
    private String path;
    private String description;
    @ManyToOne
    private Appointment appointment;
}
