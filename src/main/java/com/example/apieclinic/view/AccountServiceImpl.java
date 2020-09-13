package com.example.apieclinic.view;

import com.example.apieclinic.model.entity.Doctor;
import com.example.apieclinic.model.entity.User;
import com.example.apieclinic.model.repository.DoctorRepo;
import com.example.apieclinic.model.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor_={@Autowired})
public class AccountServiceImpl implements AccountService {
    private DoctorRepo doctorRepo;
    private UserRepo userRepo;


    @Override
    public Object getMyInfo(String mail) {
        User user = userRepo.findByEmail(mail);
        Doctor doctor = doctorRepo.findByEmail(mail);
        if (doctor != null){
            return doctor;
        }else return user;
    }
}
