package com.ashokit.beans;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac =new ClassPathXmlApplicationContext("Beans.xml");
		UserService bean = ac.getBean(UserService.class);
		String nameString = bean.service(2);
		System.out.println(nameString);
		int hashCode = bean.hashCode();
		System.out.println(hashCode);
	}
}
