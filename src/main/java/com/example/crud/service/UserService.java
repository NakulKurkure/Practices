package com.example.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dto.UserDto;
import com.example.crud.entity.UserEntity;
import com.example.crud.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void addUser(UserDto userDto) {
		
		UserEntity user=new UserEntity();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		
		userRepository.save(user);
		
	}

}
