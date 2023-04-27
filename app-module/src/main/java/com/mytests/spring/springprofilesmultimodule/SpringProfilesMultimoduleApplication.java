package com.mytests.spring.springprofilesmultimodule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfilesMultimoduleApplication implements CommandLineRunner {

    private final UsageComponent usageComponent;

    public SpringProfilesMultimoduleApplication(UsageComponent usageComponent) {
        this.usageComponent = usageComponent;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringProfilesMultimoduleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println(usageComponent);
        System.out.println("**********************************");
    }
}
