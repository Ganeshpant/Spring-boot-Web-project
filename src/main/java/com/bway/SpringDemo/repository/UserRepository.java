package com.bway.SpringDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.SpringDemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByNameAndPassword(String un, String pass);
	
}
