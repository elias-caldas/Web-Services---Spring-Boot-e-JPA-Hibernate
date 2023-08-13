package com.estudopratico.estudoSPRING.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudopratico.estudoSPRING.entities.Category;
import com.estudopratico.estudoSPRING.entities.Order;
import com.estudopratico.estudoSPRING.entities.OrderItem;
import com.estudopratico.estudoSPRING.entities.Payment;
import com.estudopratico.estudoSPRING.entities.Product;
import com.estudopratico.estudoSPRING.entities.User;
import com.estudopratico.estudoSPRING.entities.enums.OrderStatus;
import com.estudopratico.estudoSPRING.repositories.CategoryRepository;
import com.estudopratico.estudoSPRING.repositories.OrderRepository;
import com.estudopratico.estudoSPRING.repositories.ProductRepository;
import com.estudopratico.estudoSPRING.repositories.UserRepository;
import com.estudopratico.estudoSPRING.repositories.OrderItemRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired 
    private OrderItemRepository orderItemRepository;
    

    @Override
    public void run(String... args) throws Exception {
       
        User u1 = new User(null, "ELIAS", "eliascaldas@gmail.com", "988828183","23381282");
        userRepository.saveAll(Arrays.asList(u1));

        Order o1 = new Order(null, Instant.parse("2023-07-30T20:54:10Z"), OrderStatus.PAID, u1);
        orderRepository.saveAll(Arrays.asList(o1));

        Category cat1 = new Category(null, "Frutas");

        categoryRepository.saveAll(Arrays.asList(cat1));

        Product p1 = new Product(null, "Maçã", "OKDEODKEOK", 29.1, "");
        productRepository.saveAll(Arrays.asList(p1));

        p1.getCategories().add(cat1);
        productRepository.saveAll(Arrays.asList(p1));

        OrderItem oi1 = new OrderItem(o1,p1,2,p1.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1));

        Payment payment1 = new Payment(null, Instant.parse("2023-07-30T22:54:10Z"), o1);
        o1.setPayment(payment1);
        orderRepository.save(o1);
    }


}
