package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ashokit.dao.RbiBank;

@Service
public class BankService {
	@Autowired
	@Qualifier("ucoBank")
	RbiBank bank;

//	@Autowired
	public void setBank(RbiBank bank) {
		this.bank = bank;
	}

	public BankService() {
		System.out.println("Bank Service Constructor");

	}

	// ager koi default constructor nahi hai 
//	aur koi bhi method variable ya constructor ko hamne @autowired nahi kiya hai toh yeh param constructor
//	by default execute hoga aur dependency injection perform karega
//	@Autowired       
	public BankService(RbiBank bank) {
		System.out.println("Bank Service Constructor");
		this.bank = bank;
	}

	public void service() {
		bank.getBank();
	}
}
