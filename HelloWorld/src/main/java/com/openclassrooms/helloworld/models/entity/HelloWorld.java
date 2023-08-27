package com.openclassrooms.helloworld.models.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class HelloWorld {

    private String value = "Hello World!";

    @Override
    public String toString() {
        return value;
    }
}
