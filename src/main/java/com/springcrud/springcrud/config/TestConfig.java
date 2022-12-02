package com.springcrud.springcrud.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.springcrud.springcrud.model.User;
import com.springcrud.springcrud.repository.UserRepository;

@Component
@Profile("dev")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        userRepository.deleteAll();
        
        User user1 = new User(null, "Antonio Silva", "82999999999", LocalDate.parse("19/09/2003", fmt), "antonio@gmail.com", "123654");
        User user2 = new User(null, "Sergio Filho", "82999999999", LocalDate.parse("15/05/1999", fmt), "sergio@gmail.com", "456321");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
