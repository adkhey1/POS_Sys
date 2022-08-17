package com.carmesin.pos_sys.Auth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.carmesin.pos_sys.Auth.Service.authService;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class authController {

    @Autowired
    private authService authService;

    @GetMapping(value = "/test12")
    public List<String> test12(){
        String psi = "hello world";
        List<String> output = authService.getFirstname();

        output.add(psi);
        return output;
    }

}
