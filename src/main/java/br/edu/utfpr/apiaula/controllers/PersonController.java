package br.edu.utfpr.apiaula.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/person") 
public class PersonController {

    @GetMapping(value = {"", "/"})
    public String getPerson() {
        return "Oi eu sou uma Pessoa";
    }

    @PostMapping
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        System.out.println(entity);
        return entity;
    }
    
} 
