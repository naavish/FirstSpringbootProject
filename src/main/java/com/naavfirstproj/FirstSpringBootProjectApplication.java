package com.naavfirstproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootProjectApplication.class, args);
    }

    @GetMapping
    public String helloWorld(){
        return "Hello World" ;
    }


}
