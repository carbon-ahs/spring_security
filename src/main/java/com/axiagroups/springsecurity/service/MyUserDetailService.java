package com.axiagroups.springsecurity.service;

import com.axiagroups.springsecurity.model.UserPrincipal;
import com.axiagroups.springsecurity.model.Users;
import com.axiagroups.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);

        if (user == null) {
            System.out.println("User: " + username + " not found");
            throw new UsernameNotFoundException("User: " + username + " not found");
        }
        return new UserPrincipal(user);
    }
}
