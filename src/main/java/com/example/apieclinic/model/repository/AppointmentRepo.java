package com.example.apieclinic.model.repository;

import com.example.apieclinic.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {


}
