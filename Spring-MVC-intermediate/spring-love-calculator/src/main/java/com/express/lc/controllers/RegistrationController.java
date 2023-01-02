package com.express.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.lc.dto.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String registrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {

		System.out.println("Registration Page");
		
		//load the saved user data from DB
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processRegistration(@Valid @ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO, BindingResult result){
		
		
		if(result.hasErrors()) {
			
			System.out.println("My page has errors");
			
			List<ObjectError> allErrors =  result.getAllErrors();
			
			for(ObjectError error:allErrors) {
				
				System.out.println(error);
				
			}
			return "user-registration-page";
		}
		System.out.println("After Registration Process");
		
		return "registration-success";
	}

}
