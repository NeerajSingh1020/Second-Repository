package com.ashokit.beans;

public class UserService {

	UserDao dao;
	public UserService() {
		System.out.println("UserService Constructor called");
	}
	
	UserService(UserDao dao){
		System.out.println("UserService Param constructor called");
		this.dao= dao;
	}
	
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	String service(int id) {
		String name = dao.findName(id);
		return name;
		
	}
}
