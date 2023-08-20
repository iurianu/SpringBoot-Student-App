package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {

            Student iulian = new Student(
                "Iulian",
                "iulianandriescu@gmail.com",
                LocalDate.of(1980, Month.FEBRUARY, 7)
            );

            Student lyljan = new Student(
                "Lyljan",
                "dragonlyljan@gmail.com",
                LocalDate.of(1991, Month.JANUARY, 1)
            );  
            
            repository.saveAll(
                List.of(iulian, lyljan)
            );
        };
    }
}
