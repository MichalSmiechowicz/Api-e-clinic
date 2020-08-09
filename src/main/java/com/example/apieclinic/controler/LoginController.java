package com.example.apieclinic.controler;

import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.view.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    UserServiceImpl userService;

    @Autowired
    public LoginController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String test(){
        return "test";
    }

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.OK);
    }
}