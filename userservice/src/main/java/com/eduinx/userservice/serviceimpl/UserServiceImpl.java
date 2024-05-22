package com.eduinx.userservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduinx.userservice.entity.User;
import com.eduinx.userservice.repository.UserRepository;
import com.eduinx.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

}
