package com.example.apieclinic.model.repository;

import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
//    List<Appointment> findByUserID(Long userid);

}
