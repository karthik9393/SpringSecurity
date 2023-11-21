package com.codewithkarthik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codewithkarthik.dao.UserRepository;
import com.codewithkarthik.entity.User;

import java.util.List;

@Controller
public class AppController {
	@Autowired
	private UserRepository userRepo;

	@GetMapping("")
	public String viewhomePage() {
		return "index";
	}

	@GetMapping("/register")
	public String showRegistration(Model model) {
		model.addAttribute("user", new User());
		return "signup_form";

	}

	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		userRepo.save(user);
		return "register_success";

	}
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> list = userRepo.findAll();
		model.addAttribute("list", list);
		return "users";

	}

}
