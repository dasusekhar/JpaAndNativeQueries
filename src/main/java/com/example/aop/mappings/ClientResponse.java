package com.example.aop.mappings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ClientResponse {
	private String name;
	private String branchName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public ClientResponse(String name, String branchName) {
		super();
		this.name = name;
		this.branchName = branchName;
	}
	public ClientResponse() {
		super();
	}
	@Override
	public String toString() {
		return "ClientResponse [name=" + name + ", branchName=" + branchName + "]";
	}
	

}
