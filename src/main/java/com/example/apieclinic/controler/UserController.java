package com.example.apieclinic.controler;

import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.Prescription;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.view.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/appointments")
    public Set<Appointment> getAppointments(@RequestParam("id") Long userID){
        return userService.getAllAppointments(userID);
    }
    @GetMapping("/prescriptions")
    public Set<Prescription> getPrescription(@RequestParam("id") Long prescriptionID){
        return userService.getPrescription(prescriptionID);
    }
    @PostMapping("/updateInformation")
    public ResponseEntity updateUserInformation(@RequestBody User user){
        userService.update(user);
        return new ResponseEntity(HttpStatus.OK);
    }
//    @GetMapping("/leaves")
//    @GetMapping("/images")

}
