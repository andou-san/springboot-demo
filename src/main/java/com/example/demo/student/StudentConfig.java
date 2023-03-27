package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student andou = new Student(
                    "Andou",
                    "andou@gmail.com",
                    LocalDate.of(2000, Month.JULY, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.JULY, 5)
            );

            repository.saveAll(
                    List.of(andou, alex)
            );
        };
    }
}
