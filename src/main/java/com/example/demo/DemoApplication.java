
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Esta anotação indica que esta é a classe principal de uma aplicação Spring Boot
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // Este método inicia a aplicação Spring Boot
        SpringApplication.run(DemoApplication.class, args);
    }
}
