package com.example.apieclinic.view;

import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.Prescription;
import com.example.apieclinic.model.entity.User;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

public interface UserService {
    void addUser(User user);
    void update(User user);
    Set<Prescription> getPrescription(Long prescriptionID);
    Set<Appointment> getAllAppointments(Long userid);
//    List<Prescription> getAllPrescriptions(Long userid);
    List<User> getUsers();
    Set<String> getSchedule(Long docId, Timestamp dateStart, Timestamp dateEnd);
    User getMyInfo(String mail);
    void bookAppointment(Appointment appointment);
}
