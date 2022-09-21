package com.carmesin.pos_sys.Pos.Controller;

import com.carmesin.pos_sys.Auth.Model.userModel;
import com.carmesin.pos_sys.Auth.Repository.userRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.carmesin.pos_sys.Auth.Repository.userRepository;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
public class posController {

    @Autowired
    private userRepository userRepository;


    @PostMapping(value = "/getPrices", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPrices(@RequestBody String choice, HttpServletRequest request) {

        Principal principal = request.getUserPrincipal();
        userModel user = userRepository.findByEmail(principal.getName());


        String output = "hello";

        return ResponseEntity.status(HttpStatus.OK).body(user.getFirstName());
    }


}
