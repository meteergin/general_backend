package com.meteergin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meteergin.model.User;
import com.meteergin.repository.UserRepository;

@Controller
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		userRepository.save(user);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}