package com.example.apieclinic.security;

import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.model.repository.DoctorRepo;
import com.example.apieclinic.model.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private DoctorRepo doctorRepo;
    private UserRepo userRepo;

    @Autowired
    public MyUserDetailsService(DoctorRepo doctorRepo, UserRepo userRepo) {
        this.doctorRepo = doctorRepo;
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Doctor doctor = doctorRepo.findByEmail(email);
        if (doctor == null){
            User user = userRepo.findByEmail(email);
            return new MyUserDetails(user);
        }
        return new MyUserDetails(doctor);
    }
}
