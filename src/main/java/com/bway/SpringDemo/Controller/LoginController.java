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
public class LoginController {
	@Autowired
	private IUserService service;
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model) {
	
		User use = service.conformInLogin(user.getName(), user.getPassword());
		if(use !=null)
		 {
			return "home";
		}
		model.addAttribute("message", "user is not found !!");
		return "login";
	}
	
	@GetMapping("/logout")
	  public String getLogout() {
		  return "login";
	  }

}
