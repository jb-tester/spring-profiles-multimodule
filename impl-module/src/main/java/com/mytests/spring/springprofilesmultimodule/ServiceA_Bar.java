package com.mytests.spring.springprofilesmultimodule;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 4/27/2023.</p>
 * <p>Project: spring-profiles-multimodule</p>
 * *
 */
@Profile("bar_profile")
@Service
public class ServiceA_Bar implements ServiceA {
    @Override
    public String getA() {
        return "a-bar";
    }
}
