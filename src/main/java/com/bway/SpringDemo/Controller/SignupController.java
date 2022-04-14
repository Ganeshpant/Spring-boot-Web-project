package com.bway.SpringDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.SpringDemo.model.User;
import com.bway.SpringDemo.service.IUserService;

@Controller
public class SignupController {
	@Autowired
	private IUserService service;
	@GetMapping("/signup")
	public String getSignup()
	{
		return"signup";
	}
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user,Model model) {
		service.addUser(user);
		return "login";
	}
}
