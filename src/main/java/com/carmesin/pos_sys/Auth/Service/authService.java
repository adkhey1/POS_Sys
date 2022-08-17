package com.carmesin.pos_sys.Auth.Service;

import com.carmesin.pos_sys.Auth.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class authService {

    @Autowired
    private userRepository userRepository;

    public List<String> getFirstname(){
        return userRepository.allFirstName();
    }


}
