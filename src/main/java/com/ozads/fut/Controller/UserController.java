package com.ozads.fut.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ozads.fut.Request.UserCreationRequest;
import com.ozads.fut.Services.UserService;

@RestController
@RequestMapping("rest/users")
public class UserController {

		@Autowired
		
		private UserService userService;
		
		@CrossOrigin
		@RequestMapping(method=RequestMethod.POST)
		
		public ResponseEntity<Object> postUser(@RequestBody UserCreationRequest userCreationRequest){
			userService.createUser(userCreationRequest);
			return new ResponseEntity<>("User Posted Successfully", HttpStatus.CREATED);
		}
}
