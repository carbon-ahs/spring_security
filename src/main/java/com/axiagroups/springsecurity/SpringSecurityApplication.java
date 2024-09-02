package com.axiagroups.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// test 3
@SpringBootApplication
public class SpringSecurityApplication {

    @Autowired
    private UserDetailsService userDetailsService;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

//    @Bean
//    public AuthenticationProvider customAuthenticationProvider(){
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//        provider.setUserDetailsService(userDetailsService);
//        return provider;
//    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user1 = User
//                .withDefaultPasswordEncoder()
//                .username("user")
//                .password("1234")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user1);
//    }
}
