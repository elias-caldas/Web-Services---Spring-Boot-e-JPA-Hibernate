package com.estudopratico.estudoSPRING.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudopratico.estudoSPRING.entities.Order;
import com.estudopratico.estudoSPRING.entities.User;
import com.estudopratico.estudoSPRING.entities.enums.OrderStatus;
import com.estudopratico.estudoSPRING.repositories.OrderRepository;
import com.estudopratico.estudoSPRING.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;
    

    @Override
    public void run(String... args) throws Exception {
       
        User u1 = new User(null, "ELIAS", "eliascaldas@gmail.com", "988828183","23381282");
        userRepository.saveAll(Arrays.asList(u1));

        Order o1 = new Order(null, Instant.parse("2023-07-30T20:54:10Z"), OrderStatus.PAID, u1);
        orderRepository.saveAll(Arrays.asList(o1));
    }


}