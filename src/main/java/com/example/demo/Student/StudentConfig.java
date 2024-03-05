package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean//返回值添加到容器
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student frank = new Student(
                    "frank",
                    "frank900405@gmail.com",
                    LocalDate.of(2001, Month.JANUARY,5)
            );

            Student Jim = new Student(
                    "Jim",
                    "Jim@gmail.com",
                    LocalDate.of(2007, Month.JANUARY,5)
            );

            studentRepository.saveAll(
                    List.of(frank,Jim)
            );

        };
    }
}
