package com.example.apieclinic.controler;

import com.example.apieclinic.model.entity.Appointment;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.model.repository.UserRepo;
import com.example.apieclinic.view.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepo repo;
    private UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService, UserRepo repo) {
        this.repo = repo;
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/appointments")
    public Set<Appointment> getPrescriptions(@RequestParam("id") Long userID){
        return userService.getAllAppointments(userID);
    }
}
