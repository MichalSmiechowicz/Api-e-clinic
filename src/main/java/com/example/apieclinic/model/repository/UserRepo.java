package com.example.apieclinic.model.repository;

import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.Prescription;
import com.example.apieclinic.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserID(Long id);
    Set<Appointment> findAllAppointmentByUserID(Long userid);

}
