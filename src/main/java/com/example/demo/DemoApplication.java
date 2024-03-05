package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//@ImportResource(locations = {"classpath:person.xml"})
@RestController
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping()
    public Greet hello(){
        Greet response = new Greet(
                "Hello",
                List.of("Java","Golang","JavaScript"),
                new Person("Alex",15,3000)
        );
        return response;
    }

    record Greet(String greeting,
                 List<String> favProgrammingLanguages,
                 Person person){

    }

    record Person(String name,int age,double saving){

    }


}
