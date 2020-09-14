package com.example.apieclinic.view;


import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.Reception;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.model.entity.WorkHours;
import java.util.List;
import java.util.Set;

public interface ReceptionService {

    void addReception(Reception reception);
    List<Reception> getReception();

    List<WorkHours> getWorkHours(Long doctorId);
    void addWorkingHours(WorkHours workHours);
    List<User> getAllUsers();
}
