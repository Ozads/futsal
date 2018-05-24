package com.ozads.fut.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ozads.fut.Services.CourtService;
import com.ozads.fut.request.CourtCreationRequest;

@RestController
@RequestMapping("/rest/courts")
public class CourtController {
	
	@Autowired
	private CourtService courtService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Object> postCourt(@RequestBody CourtCreationRequest courtCreationRequest){
		courtService.creteCourt(courtCreationRequest);
		return new ResponseEntity<>("Court posted Successfully",HttpStatus.CREATED);
	}
	
	
}
