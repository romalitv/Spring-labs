package com.example.lab1console;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Second implements CommandLineRunner {
    public void run(String... args) throws Exception {
        System.out.println("Second");
    }
}