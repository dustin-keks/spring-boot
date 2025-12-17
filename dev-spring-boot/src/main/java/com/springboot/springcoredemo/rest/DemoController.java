package com.springboot.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springcoredemo.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    // Constructor Injection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    // Setter Injection
    // @Autowired
    // public void setCoach(Coach theCoach) {
    //     myCoach = theCoach;
    // }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
}
