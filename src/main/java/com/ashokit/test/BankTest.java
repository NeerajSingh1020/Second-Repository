package com.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.BankConfiguration;
import com.ashokit.service.BankService;

public class BankTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BankConfiguration.class);
		BankService bankService = applicationContext.getBean(BankService.class);
		bankService.service(); 
	}
}
