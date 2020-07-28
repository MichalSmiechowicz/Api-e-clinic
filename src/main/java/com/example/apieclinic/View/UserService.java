package com.example.apieclinic.view;

import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.Prescription;
import com.example.apieclinic.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

public interface UserService {
    public Set<Appointment> getAllAppointments(Long userid);
//    public List<Prescription> getAllPrescriptions(Long userid);
    public List<User> getUsers();

}
