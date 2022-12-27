package com.express.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.express.lc.model.UserInfoDTO;

@Controller
public class LCAppController {

//	@RequestMapping("/")
//	public String showHomePage(Model model) {
//		
//		//reading existing property by fetching it from DTO
//		UserInfoDTO userInfoDTO = new UserInfoDTO();
//		model.addAttribute("userInfo", userInfoDTO);
//		
//
//		return "home-page";
//	}
	
	
	// 2nd Approach
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		
		
		return "home-page";
	}
	
	//1st Approach

//	@RequestMapping("process-homepage")
//	public String showResultPage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model) {
//
//		model.addAttribute("userName", userName1);
//		model.addAttribute("crushName", crushName1);
//		
//		return "result-page";
//
//	}
	
	//2nd Approach
	
//	@RequestMapping("process-homepage")
//	public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
//
//		model.addAttribute("userName", userInfoDTO.getUserName());
//		model.addAttribute("crushName", userInfoDTO.getCrushName());
//		
//		return "result-page";
//
//	}
	
	//3rd Approach
	@RequestMapping("process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
		
		// Spring will automatically create object of UserInfoDTO and bind the data with model i,e userInfo
		// Make sure that UserInfoDTO propertyName should match with input tag. 
		// Always remember @Valid should be before @ModelAttribute and BindingResult should be after @ModelAttribute
		
		if(result.hasErrors()) {
			System.out.println("My Form has errors");
			
			return "home-page";
		}
		
		
		
		return "result-page";

	}
}
