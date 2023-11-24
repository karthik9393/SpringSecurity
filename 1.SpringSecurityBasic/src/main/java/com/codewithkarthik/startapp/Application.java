package com.codewithkarthik.startapp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//Basic authentication implementation.
//This will not work for url or role based security
//Always try with incognito mode.
//Every time use new instance of chrome.

@SpringBootApplication
@ComponentScan("com.codewithkarthik")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
