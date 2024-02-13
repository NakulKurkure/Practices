package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.dto.SuccessDto;
import com.example.crud.dto.UserDto;
import com.example.crud.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addUser(@RequestBody UserDto userDto){
		
		userService.addUser(userDto);
		
		return new ResponseEntity<>(new SuccessDto("Success..", "User register Successfully.."),HttpStatus.ACCEPTED);
		
	}
	
	
}
