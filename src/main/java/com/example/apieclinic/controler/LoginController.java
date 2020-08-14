package com.example.apieclinic.controler;

import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.view.DoctorServiceImpl;
import com.example.apieclinic.view.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class LoginController {

    private UserServiceImpl userService;
    private DoctorServiceImpl doctorService;
    @Autowired
    public LoginController(UserServiceImpl userService, DoctorServiceImpl doctorService) {
        this.userService = userService;
        this.doctorService = doctorService;
    }

    @GetMapping("/getDoctors")
    public ResponseEntity home(){
        List<Doctor> allDoctors = doctorService.getDoctors();
        return new ResponseEntity(allDoctors, HttpStatus.OK);
    }

    @GetMapping("/signIn")
    public ResponseEntity signIn(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/signUp")
    public ResponseEntity signUp(@RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.OK);
    }
}