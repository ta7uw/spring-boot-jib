package com.demo.project.springbootjibdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJibDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJibDemoApplication.class, args);
    }

    @RequestMapping("/")
    public String helloJib(){
        return "Hello, Jib";
    }

}
