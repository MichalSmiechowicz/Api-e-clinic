package com.example.apieclinic.View;

import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.WorkHours;

import java.util.List;

public interface DoctorService {
    void addDoctor(Doctor doctor);
    List<Doctor> getDoctors();

    List<WorkHours> getWorkHours(Long doc_id);
    void addWorkingHours(WorkHours workHours);
}
