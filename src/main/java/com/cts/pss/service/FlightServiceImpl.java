package com.cts.pss.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.dao.BookingRecordDao;
import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Flight;
import com.cts.pss.entity.Passenger;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightDao flightDao;
	
	@Autowired
	BookingRecordDao booDao;

	@Override
	public List<Flight> searchFlights(String origin, String destination, Date date) {
		// TODO Auto-generated method stub
		List<Flight> flights =flightDao.searchByLocation(origin, destination, date);
	   return flights;
	}

	@Override
	public void saveBooking(BookingRecord record) {
		System.out.println("record"+record);
		System.out.println(LocalDate.now()+"  "+record.getDestination()+" "+record.getFare()+" "+record.getFlightDate()+" "+record.getFlightNumber()+"  "+record.getFlightTime()+" "+record.getOrigin()+" "+record.getStatus());
		BookingRecord b =new BookingRecord(LocalDate.now(),record.getDestination(),record.getFare(),record.getFlightDate(),record.getFlightNumber(),record.getFlightTime(),record.getOrigin(),record.getStatus());

		b.setPassengers(record.getPassengers());
		System.out.println(b.toString());
		booDao.save(b);
				
	}

	@Override
	public BookingRecord getBookingDetails(int bookingId) {
		// TODO Auto-generated method stub
		return booDao.findById(bookingId).get();
	}


}
