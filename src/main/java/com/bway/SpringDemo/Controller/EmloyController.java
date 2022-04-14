package com.bway.SpringDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.SpringDemo.model.Employ;
import com.bway.SpringDemo.repository.EmployRepository;
import com.bway.SpringDemo.service.IEmployService;

@Controller
public class EmloyController {
	@Autowired
	private IEmployService service;
	@Autowired
	private EmployRepository emprepo;
	@GetMapping("/employ")
	public String getEmployForm() {
		return "Employform";
	}
	@PostMapping("/employ")
	public String postEmployForm(@ModelAttribute Employ employ ,Model model) {
		
		service.saveEmploy(employ);
		model.addAttribute("message", "Successfully added your Data");
		return "Employform";
	}
	@GetMapping("/employlist")
	public String getEmployList(Model model) {
		model.addAttribute("listemp", service.showAll());
		return"showListOfEmploy";
	}
	@GetMapping("/delete")
	public String deleteEmploy(@RequestParam int id) {
		service.deleteEmploy(id);
		return "redirect:/employlist";
	}
	
	@GetMapping("/edit")
	public String editEmployForm(@RequestParam int id, Model model) {
		
		model.addAttribute("employ", service.selectemploy(id));
		//model.addAttribute("employ",emprepo.getById(id));
		return "employEditForm";
	}
	@PostMapping("/update")
	public String updateEmploy(@ModelAttribute Employ employ, Model model) {
	
		emprepo.save(employ);
		return"redirect:/employlist";
	}
	
	
   @GetMapping("/home")
   public String getHome() {
	   return"home";
   }
   
  
}
