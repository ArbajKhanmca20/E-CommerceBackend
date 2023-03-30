package com.nagarro.service;

import java.util.Objects;
import java.util.Optional;

import com.nagarro.dao.UserRepo;
import com.nagarro.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userRepo;

	@Override
	public User getUser(int id) {
		Optional<User> result = userRepo.findById(id);

		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}

	@Override
	public int addUser(@RequestBody User user) {
		User result = userRepo.findByEmail(user.getEmail());
		if (result == null) {

			userRepo.save(user);
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public User updateUser(User newUser) {
		User user = getUser(newUser.getId());
		user.setPassword(newUser.getPassword());

		userRepo.save(user);
		return user;
	}

	@Override
	public boolean isAuth(User user) {
		User userfromDb = userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());

		return userfromDb == null ? false : true;
	}

}
