package com.carmesin.pos_sys.Auth.Controller;

import com.carmesin.pos_sys.Auth.Model.userModel;
import com.carmesin.pos_sys.Auth.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.carmesin.pos_sys.Auth.Service.authService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.List;

@Controller
public class authController {

    @Autowired
    private authService authService;

    @Autowired
    private userRepository userRepository;

    @GetMapping(value = "/test12")
    public List<String> test12() {
        String psi = "hello world";
        List<String> output = authService.getFirstname();

        output.add(psi);
        return output;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public void posted() {
        System.out.println("Post");
    }

    //Start Page
    @GetMapping({"/home", "/", ""})
    public String viewHomePage() {
        return "index";
    }

    /**
     * input all attributes from user. execute registering method in register.html
     *
     * @param model
     * @return register page
     */
    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new userModel());
        return "Register";
    }


    /**
     * save complete user in database. goes back to index page
     *
     * @param user
     * @return index.html
     */
    @PostMapping("/registering")
    public String registerUser(userModel user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        userRepository.save(user);

        return "index";

    }

    @GetMapping("/termsofuse")
    public String termsOfUse() {
        return "termsofuse";
    }

    @GetMapping("/security")
    public String security() {
        return "security";
    }

    @GetMapping("/cookies")
    public String cookies() {
        return "cookies";
    }
}
