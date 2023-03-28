package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository("ucoBank")
public class UcoBank implements RbiBank {
	
	public UcoBank() {
		System.out.println("Uco-Bank Constructor");
	}

	@Override
	public void getBank() {

		System.out.println("Welcome to Uco bank");
	}

}
