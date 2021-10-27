package br.com.estude.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class userController {
    
    @GetMapping("/")    
    public String helloWorld(){
        return "Hello World";
    }

}
