package com.openclassrooms.helloworld.services;

import com.openclassrooms.helloworld.models.entity.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    public HelloWorld getHelloWorld(){
        return new HelloWorld();
    }

}
