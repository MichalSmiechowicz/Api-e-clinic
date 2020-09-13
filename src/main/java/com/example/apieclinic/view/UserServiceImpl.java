package com.example.apieclinic.view;

import com.example.apieclinic.exception.UserAlreadyExistException;
import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.Prescription;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.model.repository.AppointmentRepo;
import com.example.apieclinic.model.repository.DoctorRepo;
import com.example.apieclinic.model.repository.PrescriptionRepo;
import com.example.apieclinic.model.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor(onConstructor_={@Autowired})
public class UserServiceImpl implements com.example.apieclinic.view.UserService {

    private UserRepo userRepo;
    private PrescriptionRepo prescriptionRepo;
    private AppointmentRepo appointmentRepo;
    private DoctorRepo doctorRepo;

    @Override
    public User getMyInfo(String mail) {
        return userRepo.findByEmail(mail);
    }

    @Override
    public Set<String> getSchedule(Long docId, Timestamp dateStart, Timestamp dateEnd) {
        Set<Appointment> appointments = appointmentRepo.findAllByDoctorIdAndDateTimeBetween(docId, dateStart, dateEnd);
        Set<String> schedule = new HashSet<>();
        for (Appointment a: appointments) {
            schedule.add(a.getDateTime().toString());
        }
        return schedule;
    }

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
    public void update(User user) {
        User userInDb = userRepo.findByEmail(user.getEmail());
        user.setUserID(userInDb.getUserID());
        userInDb = user;
        userRepo.save(userInDb);
    }

    @Override
    public Set<Prescription> getPrescription(Long appointmentID) {
        return prescriptionRepo.findByAppointmentId(appointmentID);
    }

    @Override
    public Set<Appointment> getAllAppointments(Long userid) {
        User user = userRepo.findByUserID(userid);
        return user.getAppointments();
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
