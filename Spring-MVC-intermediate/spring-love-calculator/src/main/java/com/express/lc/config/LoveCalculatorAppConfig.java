package com.express.lc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.express.lc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.express.lc.controllers")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

	// Set Up View Resolver
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		
		internalResourceViewResolver.setPrefix("/WEB-INF/view/");
		internalResourceViewResolver.setSuffix(".jsp");
		
		return internalResourceViewResolver;
		
	}
	
	@Bean
	public MessageSource messageSource(){
		
		System.out.println("MessageSource method called");
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		
		return messageSource;
	}
	
	@Bean
	public LocalValidatorFactoryBean validator(){
		
		System.out.println("LocalValidatorFactoryBean method called");
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		
		return localValidatorFactoryBean;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		System.out.println("Inside addFormatters method ");
		registry.addFormatter(new PhoneNumberFormatter());
	}
	
	@Override
	public Validator getValidator() {
		
		return validator();
	}


}


