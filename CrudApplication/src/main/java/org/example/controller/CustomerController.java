package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello siba";
    }

    @GetMapping("/greet/{values}")
    public String Hello(@PathVariable String value){
        return "Hello  "+value + "Siba";
    }
}