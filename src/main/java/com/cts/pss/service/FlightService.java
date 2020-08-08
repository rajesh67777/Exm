package com.cts.pss.service;

import java.util.Date;
import java.util.List;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Flight;

public interface FlightService {
	
	List<Flight>searchFlights(String origin, String destination, Date date);

	void saveBooking(BookingRecord record);

	BookingRecord getBookingDetails(int bookingId);

}
