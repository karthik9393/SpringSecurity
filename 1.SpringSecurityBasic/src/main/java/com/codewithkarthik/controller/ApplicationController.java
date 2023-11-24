package com.codewithkarthik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
	@RequestMapping("/profile")
	@ResponseBody
	public String profilePage() {
		return "user profile Page";
	}
	
	@RequestMapping("/home")
	@ResponseBody
	public String homePage() {
		return "Home page";
	}

}
