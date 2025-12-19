package com.springboot.b_spring_boot_spring_core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.b_spring_boot_spring_core.common.Coach;
import com.springboot.b_spring_boot_spring_core.common.SwimCoach;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
