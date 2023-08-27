package com.openclassrooms.helloworld;

import com.openclassrooms.helloworld.services.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired
	private BusinessService businessService;


	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld(){
		assertEquals("Hello World!",businessService.getHelloWorld().toString());
	}





}
