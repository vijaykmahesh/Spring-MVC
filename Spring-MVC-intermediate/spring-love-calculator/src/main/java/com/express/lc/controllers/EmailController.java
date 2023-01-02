package com.express.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.lc.dto.EmailDTO;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {

		model.addAttribute("emailDTO", new EmailDTO());

		return "send-email-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDto) {

		return "process-email-page";
	}

}
