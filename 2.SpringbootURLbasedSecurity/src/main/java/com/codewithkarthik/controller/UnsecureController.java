package com.codewithkarthik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//InMemoryUserDetailsManager
//User - username, password, roles 

//UserDetailsService
//SecurityConfigurerAdapter - we create
//WebSecurityConfigurerAdapter


@RestController
@RequestMapping("/unsecured")
public class UnsecureController {
	
	@GetMapping("/hello")
	public String unsecuredHello() {
		return "Hello from the unsecured endpoint!@!!";
	}

}
