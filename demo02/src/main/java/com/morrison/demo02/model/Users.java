package com.morrison.demo02.model;

public class Users {

	private int userid;
	private String name;
	private String address;
	private String email;
	public Users() {
		super();
	}
	
	public Users(int userid, String name, String address, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}


	
}
