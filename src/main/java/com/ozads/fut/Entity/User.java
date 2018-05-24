package com.ozads.fut.Entity;

import javax.persistence.Id;

public class User {
	
	@Id
	private Long id;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String phone;
	private String email;
	private String password;
	private String location;
	
}
