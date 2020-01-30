package com.sayit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayit.model.User;
import com.sayit.repositries.UserRepo;

@Service
public class LoginService {
    
	public  LoginService(){
		
	}
	
	@Autowired
	UserRepo userRepo;
	
	
	public List<User>   loginUserinfo(String username , String password) {
		
		List<User> user =userRepo.findByNameAndPassword(username, password);
		return user;
	}
}
