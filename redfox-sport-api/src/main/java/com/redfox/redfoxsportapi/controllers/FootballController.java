package com.redfox.redfoxsportapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(path = "football")
public class FootballController {

    @GetMapping(value="leagues")
    public String getLeagues() {
        return "Hello world";
    }
    
}