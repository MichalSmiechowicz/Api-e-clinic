package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "SickLeaves")
public class SickLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long leavesID;
    private Date startDate;
    private Date endDate;
    private String remarks;
    @ManyToOne
    private Appointment appointment;
}
