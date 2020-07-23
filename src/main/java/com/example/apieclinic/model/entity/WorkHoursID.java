package com.example.apieclinic.model.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class WorkHoursID implements Serializable {
    private Long doctorID;
    private Integer day;

}

