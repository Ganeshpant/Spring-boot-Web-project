package com.bway.SpringDemo.Controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GallaryController {

	
	@GetMapping("/gallary")
	public String gallary(Model model) {
		
		File dir = new File("src\\main\\resources\\static\\images");
		String[] imgnames = dir.list();
		model.addAttribute("imglist", imgnames);
		return "gallary";
	}
}
