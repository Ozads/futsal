package com.ozads.fut.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozads.fut.Controller.OwnerController;
import com.ozads.fut.Entity.Booking;
import com.ozads.fut.Repository.BookingRepository;
import com.ozads.fut.Request.BookingCreationRequest;

@Service
public class BookingService {

	@Autowired
	
	private BookingRepository bookingRepository;
	
	public void createBooking(BookingCreationRequest bookingCreationRequest) {
		Booking booking=new Booking();
		booking.setUser(bookingCreationRequest.getUser());
		booking.setOwner(bookingCreationRequest.getOwner());
		booking.setCourt(bookingCreationRequest.getCourt());
		booking.setDate(bookingCreationRequest.getDate());
		booking.setTime(bookingCreationRequest.getTime());
		
		bookingRepository.save(booking);
	}
}
