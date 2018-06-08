package com.ozads.fut.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozads.fut.Entity.User;
import com.ozads.fut.Repository.UserRepository;
import com.ozads.fut.Request.UserCreationRequest;

@Service
public class UserService {
	
	@Autowired
	
	private UserRepository userRepository;
	
	public void createUser(UserCreationRequest userCreationRequest) {
		User user=new User();
		user.setFirstName(userCreationRequest.getFirstName());
		user.setLastName(userCreationRequest.getLastName());
		user.setEmail(userCreationRequest.getEmail());
		user.setLocation(userCreationRequest.getLocation());
		user.setPassword(userCreationRequest.getPassword());
		user.setPhone(userCreationRequest.getPhone());
		
		userRepository.save(user);
	}

}
