package com.example.demo;

import com.example.demo.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest()
class DemoApplicationTests {
    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloServer(){
        boolean b = ioc.containsBean("helloService");

        System.out.println(b);
    }
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
