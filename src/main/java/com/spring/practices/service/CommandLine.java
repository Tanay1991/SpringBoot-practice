package com.spring.practices.service;


import com.spring.practices.dao.UserDetailsDao;
import com.spring.practices.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CommandLine {

    @Bean
    public CommandLineRunner createAdminUser(UserDetailsDao userDetailsDao, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userDetailsDao.findByUsername("admin").isEmpty()) {
                User admin = new User();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin1234")); // Securely store password
                admin.setRole("ADMIN");
                userDetailsDao.save(admin);
                System.out.println("Default admin user created!");
            }
            if (userDetailsDao.findByUsername("user").isEmpty()) {
                User admin = new User();
                admin.setUsername("user");
                admin.setPassword(passwordEncoder.encode("user1234")); // Securely store password
                admin.setRole("USER");
                userDetailsDao.save(admin);
                System.out.println("Default admin user created!");
            }
        };
    }
}
