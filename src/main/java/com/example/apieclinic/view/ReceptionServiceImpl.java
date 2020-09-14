package com.example.apieclinic.view;


import com.example.apieclinic.model.entity.Reception;
import com.example.apieclinic.model.repository.ReceptionRepo;
import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.model.entity.WorkHours;
import com.example.apieclinic.model.repository.AppointmentRepo;
import com.example.apieclinic.model.repository.DoctorRepo;
import com.example.apieclinic.model.repository.UserRepo;
import com.example.apieclinic.model.repository.WorkHoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor(onConstructor_={@Autowired})
public class ReceptionServiceImpl implements ReceptionService{

    private final ReceptionRepo receptionRepo;
    private final WorkHoursRepo workHoursRepo;
    @Override
    public void addReception(Reception reception) { receptionRepo.save(reception); }
    @Override
    public List<Reception> getReception() { return receptionRepo.findAll(); }
    @Override
    public void addWorkingHours(WorkHours workHours) {
        workHoursRepo.save(workHours);
    }
    @Override
    public List<WorkHours> getWorkHours(Long receptionId) { return workHoursRepo.findByWorkHoursIDDoctorID(receptionId); }
}
