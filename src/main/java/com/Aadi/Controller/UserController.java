package com.Aadi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
@GetMapping("/User")
	public String User(Model model) {
		
		
		String msgString ="hi Aaditya welcome to this Page from UserController";
		
		model.addAttribute("Message", msgString);
		
		
		
		return "Welcome";
	}
	
	
}
