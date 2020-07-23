package com.example.apieclinic.controler;

import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    DoctorRepo doctorRepo;
    @Autowired
    public DoctorController(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }

    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor){
        System.out.println(doctor.toString());
        doctorRepo.save(doctor);
    }

    @GetMapping("/doc")
    public List<Doctor> home(){
        return doctorRepo.findAll();
    }
}
