package com.example.apieclinic.controler;

import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.view.DoctorService;
import com.example.apieclinic.view.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Do testów zmienić na "*"
@CrossOrigin(origins = "https://plusmed.cloud")
@RestController
public class LoginController {

    private final UserService userService;
    private final DoctorService doctorService;
    @Autowired
    public LoginController(UserService userService, DoctorService doctorService) {
        this.userService = userService;
        this.doctorService = doctorService;
    }

    @GetMapping("/getDoctors")
    public ResponseEntity<List<Doctor>> home(){
        List<Doctor> allDoctors = doctorService.getDoctors();
        return new ResponseEntity<>(allDoctors, HttpStatus.OK);
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
