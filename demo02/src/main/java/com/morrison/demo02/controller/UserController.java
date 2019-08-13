package com.morrison.demo02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.morrison.demo02.model.Users;
import com.morrison.demo02.service.UserService;

@RestController
public class UserController {

	@Autowired(required = true)
	UserService service;
	
    
	
	
}
