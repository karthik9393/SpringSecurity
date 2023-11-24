package com.codewithkarthik.startapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//URL based security implementation

@SpringBootApplication
@ComponentScan("com.codewithkarthik")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
