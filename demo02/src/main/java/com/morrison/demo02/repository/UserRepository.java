package com.morrison.demo02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.morrison.demo02.entity.UsersEntity;
import com.morrison.demo02.model.Users;

@Repository
public interface UserRepository  extends JpaRepository<UsersEntity, Integer>{
	
}
