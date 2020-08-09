package com.example.apieclinic.model.repository;

import com.example.apieclinic.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
    Set<Appointment> findByUserId(Long userid);

}
