package com.express.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.DTO.WebsiteInfoDTO;

@Controller
@ControllerAdvice
public class DemoController {
	
	@ModelAttribute("websiteInfoDto")
	public WebsiteInfoDTO getWebsiteInfoDTO() {
		
		System.out.println("@ModelAttribute : inside getWebsiteInfoDTO");
		
		WebsiteInfoDTO websiteInfoDTO = new WebsiteInfoDTO();
		
		websiteInfoDTO.setWebsiteName("seleniumm express");
		websiteInfoDTO.setWebsiteCategory("education");
		
		return websiteInfoDTO;
		
	}

	@RequestMapping("/showWebsiteInfo")
	public String showWebsiteInfo(Model model) {
		
		System.out.println("@ModelAttribute : inside showWebsiteInfo");
		
		//The object which is created and return from getWebsiteInfoDTO() can be accessed
		
		WebsiteInfoDTO websiteInfoDto = (WebsiteInfoDTO)model.getAttribute("websiteInfoDTO");
		
		System.out.println("WebsiteInfoDTO inside showWebsiteInfo" +websiteInfoDto.getWebsiteCategory());

		return "test";
	}
	
	@RequestMapping("/showCompanyInfo")
	public String showCompanyInfo(Model model) {
		
		System.out.println("@ModelAttribute : inside showCompanyInfo");
		
		//The object which is created and return from getWebsiteInfoDTO() can be accessed
		
		WebsiteInfoDTO websiteInfoDto = (WebsiteInfoDTO)model.getAttribute("websiteInfoDTO");
		
		System.out.println("WebsiteInfoDTO inside showCompanyInfo" +websiteInfoDto.getWebsiteName());

		return "test";
	}
	
	@RequestMapping("/showAllertInfo")
	public String showAllertInfo(@ModelAttribute("websiteInfoDto") WebsiteInfoDTO websiteInfoDTO) {
		
		System.out.println("@ModelAttribute : inside showAllertInfo");
		
		// First Spring checks whether websiteInfoDto object is avaliable inside model if it is avaliable it won't create Object or else it will create.
		// Since already object is avaliable in model i,e in (getWebsiteInfoDTO()) again WebsiteInfoDTO object won't be created again 
		
		
		System.out.println("WebsiteInfoDTO inside showCompanyInfo" +websiteInfoDTO.getWebsiteName());

		return "test";
	}


}
