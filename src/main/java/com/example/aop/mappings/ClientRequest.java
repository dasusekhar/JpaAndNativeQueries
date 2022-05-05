package com.example.aop.mappings;

import com.example.aop.entity.Admin;
import com.example.aop.entity.Employee;

public class ClientRequest {
	
	
	private Admin admin;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public ClientRequest(Admin admin) {
		super();
		this.admin = admin;
	}

	public ClientRequest() {
		super();
	}
	

	


}
