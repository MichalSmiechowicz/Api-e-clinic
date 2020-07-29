package com.example.apieclinic.controler;

import com.example.apieclinic.view.DoctorServiceImpl;
import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.WorkHours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    private DoctorServiceImpl doctorService;
    @Autowired
    public DoctorController(DoctorServiceImpl doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping("/doctor/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor){
        System.out.println(doctor.toString());
        doctorService.addDoctor(doctor);
    }

    @GetMapping("/doctor/doc")
    public List<Doctor> home(){
        return doctorService.getDoctors();
    }

    @PostMapping("/doctor/setWorkHours")
    public void setWorkHours(@RequestBody WorkHours workHours){
        doctorService.addWorkingHours(workHours);
    }

    @GetMapping("/doctor/getHoursOfDoc")
    public List<WorkHours> getHoursOfDoc(@RequestParam("id") Long docID){
        return doctorService.getWorkHours(docID);
    }
}
