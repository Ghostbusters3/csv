package com.morrison.demo02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morrison.demo02.model.Users;
import com.morrison.demo02.repository.UserRepository;

@Service
public class UserService  {
	
	@Autowired(required=true)
	private UserRepository repository;
	
//	public void saveAll(Users user) {
//		 repository.saveAll(user);
//				
		
		 
	}


