package com.express.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.express.controllers", "com.express.DTO"})
public class ModelAttributeAppConfig implements WebMvcConfigurer {
	
	// Set Up View Resolver
	
		@Bean
		public InternalResourceViewResolver viewResolver(){
			
			InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
			
			internalResourceViewResolver.setPrefix("/WEB-INF/view/");
			internalResourceViewResolver.setSuffix(".jsp");
			
			return internalResourceViewResolver;
			
		}

}
