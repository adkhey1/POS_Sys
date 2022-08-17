package com.carmesin.pos_sys.Auth.Security;

import com.carmesin.pos_sys.Auth.Model.userModel;
import com.carmesin.pos_sys.Auth.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserSecurityService implements UserDetailsService {

    @Autowired
    private userRepository userRepository;


    private userModel user;


    //Load User by email
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userModel user = userRepository.findByEmail(username);

        if(user==null){
            throw new UsernameNotFoundException("User not found");
        }

        return new UserSecurity(user);

    }
}
