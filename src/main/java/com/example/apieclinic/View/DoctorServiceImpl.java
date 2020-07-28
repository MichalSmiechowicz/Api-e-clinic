package com.example.apieclinic.view;

import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.WorkHours;
import com.example.apieclinic.model.repository.DoctorRepo;
import com.example.apieclinic.model.repository.WorkHoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{

    private DoctorRepo doctorRepo;
    private WorkHoursRepo workHoursRepo;

    @Autowired
    public DoctorServiceImpl(DoctorRepo doctorRepo, WorkHoursRepo workHoursRepo) {
        this.doctorRepo = doctorRepo;
        this.workHoursRepo = workHoursRepo;
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepo.save(doctor);
    }

    @Override
    public List<Doctor> getDoctors() {
        return doctorRepo.findAll();
    }

    @Override
    public void addWorkingHours(WorkHours workHours) {
        workHoursRepo.save(workHours);
    }

    @Override
    public List<WorkHours> getWorkHours(Long doc_id) {
//        workHoursRepo.findAll().stream().allMatch(Predicate.isEqual(WorkHours::getWorkHoursID::));
        return workHoursRepo.findByWorkHoursIDDoctorID(doc_id);

    }
}
