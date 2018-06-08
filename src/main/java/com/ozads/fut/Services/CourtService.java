package com.ozads.fut.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozads.fut.Entity.Court;
import com.ozads.fut.Repository.CourtRepository;
import com.ozads.fut.Request.CourtCreationRequest;

@Service
public class CourtService {
	
	@Autowired
	private CourtRepository courtRepository;

	public void createCourt(CourtCreationRequest courtCreationRequest) {
		Court court=new Court();
		court.setLocation(courtCreationRequest.getLocation());
		court.setName(courtCreationRequest.getName());
		court.setPhone(courtCreationRequest.getPhoneNo());
		courtRepository.save(court);
		
	}

}

