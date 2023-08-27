package com.openclassrooms.helloworld;

import com.openclassrooms.helloworld.models.entity.HelloWorld;
import com.openclassrooms.helloworld.services.BusinessService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Exo1 implements CommandLineRunner {

    private final BusinessService businessService;

    public Exo1(BusinessService businessService) {
        this.businessService = businessService;
    }


    @Override
    public void run(String... args) throws Exception {
        HelloWorld hw = businessService.getHelloWorld();
        System.out.println(hw.toString());
    }
}
