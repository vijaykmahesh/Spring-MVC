package com.express.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.DTO.Info;
import com.express.DTO.WebsiteInfoDTO;

@Controller
public class TestController {

	Info serverInfo;

	@RequestMapping("/showTestInfo")
	public String showTestInfo(Model model) {

		System.out.println("@ModelAttribute : inside showWebsiteInfo");

		// The object which is created and return from getWebsiteInfoDTO() can be
		// accessed

		WebsiteInfoDTO websiteInfoDto = (WebsiteInfoDTO) model.getAttribute("websiteInfoDTO");

		System.out.println("WebsiteInfoDTO inside showWebsiteInfo" + websiteInfoDto.getWebsiteCategory());

		serverInfo.setServerIp("192.178.9.00");

		System.out.println("Ip address of server is" + serverInfo.getServerIp());

		return "test";
	}

}
