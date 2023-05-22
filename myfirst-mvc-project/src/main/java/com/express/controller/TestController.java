package com.express.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.express.api.MyBean;

@Controller
public class TestController {
	
	@Autowired
	MyBean bean;
	
	@RequestMapping("/testing1")
	public void myWebsite(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("My new Website name" +bean.getWebsiteName()+ "<br/>");
		bean.setWebsiteName("Express updated");
		response.getWriter().write("My new Website Updated" +bean.getWebsiteName()+ "<br/>");
		
		
	}
	
	@RequestMapping("/testing2")
	public void test2(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("My new Website" +bean.getWebsiteName()+ "<br/>");
		
		
	}

}
