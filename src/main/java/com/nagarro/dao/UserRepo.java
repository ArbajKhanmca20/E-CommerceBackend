package com.nagarro.dao;

import com.nagarro.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

	User findByEmail(String email);
	User findByEmailAndPassword(String email,String password);
}
