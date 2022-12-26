package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;

@Controller
public class CafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		String name = "Vijay";
		model.addAttribute("myNameValue", name);
		
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(ServletWebRequest request,Model model ) {
	
		String foodType = request.getParameter("foodType");
		model.addAttribute("foodType", foodType);
		
		return "process-order";
		
	}

}
