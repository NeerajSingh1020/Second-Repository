package com.ashokit.dao;

import org.springframework.stereotype.Component;

@Component("sbiBank")
public class SbiBank implements RbiBank {

	public SbiBank() {
		System.out.println("Sbi-Bank Constructor");
	}
	@Override
	public void getBank() {

		System.out.println("Welcome to Sbi bank");
	}

}
