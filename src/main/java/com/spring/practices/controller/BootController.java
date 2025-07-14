package com.spring.practices.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class BootController {

    @GetMapping(value = "/health")
    public String getHealth()
    {
        return "Healthy";
    }



}
