package com.springboot.b_spring_boot_spring_core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.b_spring_boot_spring_core.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    // Constructor Injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
