package com.ozads.fut.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ozads.fut.Request.BookingCreationRequest;
import com.ozads.fut.Services.BookingService;

@RestController
@RequestMapping("rest/booking")
public class BookingController {
	
	
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Object> postCourt(@RequestBody BookingCreationRequest bookingCreationRequest){
		bookingService.createBooking(bookingCreationRequest);
		return new ResponseEntity<>("Booking posted Successfully",HttpStatus.CREATED);
	}
	
	
}
