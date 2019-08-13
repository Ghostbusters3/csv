package com.morrison.demo02.entity;

import javax.annotation.Generated;
import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name="users")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String name;
	private String address;
	private String email;
	public UsersEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsersEntity(int userid, String name, String address, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	@Override
	public String toString() {
		return "UsersEntity [userid=" + userid + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	

}
