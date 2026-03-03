package com.Aadi.Controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/Welcome")
	public ModelAndView Welcome() {
		
		ModelAndView model = new ModelAndView();
		
		String msgString = "Aaditya";
		
		model.addObject("message",msgString);
		
		model.addObject("names",Arrays.asList("Ram","Shri","Hari"));
		
		Student s1 = new Student(1,"Aaditya","Mumbai");
		
		model.addObject("student",s1);
		
		model.setViewName("Welcome");
		
		return model;
		
	}
	
	
	
}
