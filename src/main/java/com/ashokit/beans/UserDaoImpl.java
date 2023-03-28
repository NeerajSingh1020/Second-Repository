package com.ashokit.beans;

public class UserDaoImpl implements UserDao {

	
	public UserDaoImpl() {
		System.out.println("UserDao Impl constructor printed");
	}
	public String findName(int id) {
		String name;
		if(id==1) {
			name="Neeraj";
		}else if(id==2) {
			name="Aniket";
		}else if(id==3) {
			name="Amar";
		}else {
			name="No name found";
		}
		return name;
	}

}
