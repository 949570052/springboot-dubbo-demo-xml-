package com.xdclass.user.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xdclass.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	//×¢½â°æ±¾@Reference(version = "1.0.0")
	private UserService userService;
	
	@RequestMapping("/sayHello")
	public String sayHello(){
		return userService.sayHello();
	}
}
