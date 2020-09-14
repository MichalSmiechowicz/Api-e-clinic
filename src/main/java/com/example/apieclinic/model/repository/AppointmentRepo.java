package com.example.apieclinic.model.repository;

import com.example.apieclinic.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Set;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
    Set<Appointment> findByUserId(Long userId);
    Set<Appointment> findByDoctorId(Long userId);
    Set<Appointment> findAllByDoctorIdAndDateTimeBetween(Long docId, Timestamp dateTimeStart, Timestamp dateTimeEnd);
    Boolean existsBydateTime(Timestamp dateTime);
}
