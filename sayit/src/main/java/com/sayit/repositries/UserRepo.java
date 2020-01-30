package com.sayit.repositries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sayit.model.User;

//@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	List<User> findByNameAndPassword(String user,String password);

}
