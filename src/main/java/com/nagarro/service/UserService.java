package com.nagarro.service;

import com.nagarro.entity.User;

public interface UserService {
	User getUser(int id);

	int addUser(User user);

	User updateUser(User newUser);

	boolean isAuth(User user);
}
