package com.express.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.express.lc.dto.UserInfoDTO;

@Controller
@SessionAttributes("userInfo")
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
	public String showHomePage(Model model) {

		// Read the existing property values by fetching from DTO.

		// Check whether user had already visited the website if yes attach cookie and
		// send
//		Cookie[] cookies = request.getCookies();
//		for (Cookie temp : cookies) {
//
//			if ("lcApp.userName".equals(temp.getName())) {
//
//				String myUserName = temp.getValue();
//				userInfoDTO.setUserName(myUserName);
//			}
//
//		}
		model.addAttribute("userInfo", new UserInfoDTO());
		return "home-page";
	}

	// 1st Approach

//	@RequestMapping("process-homepage")
//	public String showResultPage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model) {
//
//		model.addAttribute("userName", userName1);
//		model.addAttribute("crushName", crushName1);
//		
//		return "result-page";
//
//	}

	// 2nd Approach

//	@RequestMapping("process-homepage")
//	public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
//
//		model.addAttribute("userName", userInfoDTO.getUserName());
//		model.addAttribute("crushName", userInfoDTO.getCrushName());
//		
//		return "result-page";
//
//	}

	// 3rd Approach
	@RequestMapping("process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result,
			HttpServletRequest request) {

		// Spring will automatically create object of UserInfoDTO and bind the data with
		// model i,e userInfo
		// Spring is Writting the Values to properties By fetching it from URL.
		// Always remember @Valid should be before @ModelAttribute and BindingResult
		// should be after @ModelAttribute

		if (result.hasErrors()) {
			System.out.println("My Form has errors");

			return "home-page";
		}

		// Create a Cookie for UserName

//		Cookie cookie = new Cookie("lcApp.userName", userInfoDTO.getUserName());
//		cookie.setMaxAge(60 * 60 * 24); // i,e 24Hrs

		// Add Cookie to response

//		response.addCookie(cookie);

		// sessions

//		HttpSession session =  request.getSession();
//		session.setAttribute("userName", userInfoDTO.getUserName());
//		session.setMaxInactiveInterval(0);

		// Write a service to calculate love %

		return "result-page";

	}
}
