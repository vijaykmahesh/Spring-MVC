package com.express.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.lc.model.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String registrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {

		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processRegistration(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO){
		
		return "registration-success";
	}

}
