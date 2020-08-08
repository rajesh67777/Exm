package com.cts.pss.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Flight;
import com.cts.pss.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/hello/{origin}/{destination}/{date}")
	public List<Flight> HelloWorld(@PathVariable("origin") String origin, @PathVariable("destination") String destination,@PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date fromDate) {
		List<Flight>fliight = flightService.searchFlights(origin, destination, fromDate);
		if(fliight.size()==0) {
			throw new FlightsNotFoundException("Flights Not Found");
		}
		return fliight;
	}
    
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveBooking")
	public void HelloWorld(@RequestBody BookingRecord record) {
		 flightService.saveBooking(record);
		
		
	}
   
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getBookingRecord/{id}")
	public BookingRecord HelloWorld(@PathVariable("id") int id) {
		
		BookingRecord bba=flightService.getBookingDetails(id);
		return bba;
		
	}
	
}
