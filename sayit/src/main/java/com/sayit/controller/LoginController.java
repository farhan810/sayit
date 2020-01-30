package com.sayit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sayit.exceptions.InvalidHeaderFieldException;
import com.sayit.model.User;
import com.sayit.service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController  {

	
	public LoginController() {
		
	}
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String demo() {
		
		return "test api here";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
  public List<User> loginUser(String userName, String password)    {
		System.out.println("login from here ");
	 List<User> user = loginService.loginUserinfo(userName,password);
	if(user==null) {
		
		throw new InvalidHeaderFieldException("invalid user or password");
	}
	 
	 return user;
		
		
	}
}
