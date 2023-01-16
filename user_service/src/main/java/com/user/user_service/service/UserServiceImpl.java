package com.user.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
			new User(1L, "Utkarsh Gupta", "23456677"),
			new User(12L, "Abhay Kumar", "009099099")
			);
	
	@Override
	public User getUser(Long id) {
		 
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
