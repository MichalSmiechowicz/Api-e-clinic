package com.example.apieclinic.model.repository;

import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepo extends JpaRepository<Prescription, Long> {
    Prescription findByAppointment(Appointment appointment);

}
