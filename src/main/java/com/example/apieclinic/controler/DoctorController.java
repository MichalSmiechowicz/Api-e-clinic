package com.example.apieclinic.controler;

import com.example.apieclinic.view.DoctorServiceImpl;
import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.WorkHours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    private DoctorServiceImpl doctorService;
    @Autowired
    public DoctorController(DoctorServiceImpl doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping("/addDoctor")
    public ResponseEntity addDoctor(@RequestBody Doctor doctor){
        System.out.println(doctor.toString());
        doctorService.addDoctor(doctor);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/setWorkHours")
    public void setWorkHours(@RequestBody WorkHours workHours){
        doctorService.addWorkingHours(workHours);
    }

    @GetMapping("/getHoursOfDoc")
    public List<WorkHours> getHoursOfDoc(@RequestParam("id") Long docID){
        return doctorService.getWorkHours(docID);
    }
}
