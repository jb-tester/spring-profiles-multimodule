package com.mytests.spring.springprofilesmultimodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 4/27/2023.</p>
 * <p>Project: spring-profiles-multimodule</p>
 * *
 */
@Component
public class UsageComponent {
    @Value("${myproperty}")
    String profProp;

    @Autowired ServiceA serviceA;

    @Override
    public String toString() {
        return "UsageComponent{" +
                profProp +
                "; serviceA=" + serviceA.getA() +
                '}';
    }
}
