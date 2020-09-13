package com.example.apieclinic.controler;

import com.example.apieclinic.model.entity.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Do testów zmienić na "*"
@CrossOrigin(origins = "https://plusmed.cloud")
@RestController
@RequestMapping("/reception")
public class ReceptionController {
    @GetMapping("/test")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("allDoctors", HttpStatus.OK);
    }
}
