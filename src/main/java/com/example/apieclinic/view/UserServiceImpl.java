package com.example.apieclinic.view;

import com.example.apieclinic.exception.UserAlreadyExistException;
import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.model.repository.AppointmentRepo;
import com.example.apieclinic.model.repository.PrescriptionRepo;
import com.example.apieclinic.model.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements com.example.apieclinic.view.UserService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    PrescriptionRepo prescriptionRepo;
    @Autowired
    AppointmentRepo appointmentRepo;

    @Override
    public void addUser(User user) {
        if (!userRepo.existsByEmail(user.getEmail())){
            userRepo.save(user);
        }else {
            throw new UserAlreadyExistException(user.getEmail());
//            throw new UserAlreadyExistException(user.getEmail());
        }
    }

    @Override
    public Set<Appointment> getAllAppointments(Long userid) {
        User user = userRepo.findByUserID(userid);
        Set<Appointment> a = user.getAppointments();
        return a;
//        return appointmentRepo.findByUser(user);
    }

//    @Override
//    public List<Prescription> getAllPrescriptions(Long userid) {
//        List<Appointment> appointments = appointmentRepo.findByUser(userid);
//        List<Prescription> prescriptions = null;
//        for (Appointment appointment: appointments) {
//            prescriptions.add(prescriptionRepo.findByAppointment(appointment));
//        }
//        return prescriptions;
//    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
