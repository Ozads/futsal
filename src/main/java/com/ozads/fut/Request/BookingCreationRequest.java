package com.ozads.fut.Request;

import java.util.Date;

import com.ozads.fut.Entity.Court;
import com.ozads.fut.Entity.Owner;
import com.ozads.fut.Entity.User;

public class BookingCreationRequest {
	
	private Owner owner;
	private User user;
	private Court court;
	private Date date;
	private String time;
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Court getCourt() {
		return court;
	}
	public void setCourt(Court court) {
		this.court = court;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	

}
