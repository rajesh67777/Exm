package com.cts.pss.excption;

import java.io.FileNotFoundException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cts.pss.controller.FlightsNotFoundException;

@ControllerAdvice
@RestController
public class CustomoziedException extends ResponseEntityExceptionHandler {
    
	
	@ExceptionHandler(FlightsNotFoundException.class)
	public final ResponseEntity<Object> handleFlightNotFoundException(FlightsNotFoundException ex, WebRequest wr){
		ExcptionResponse er=new ExcptionResponse(new Date(),ex.getMessage(),"Flights Not available this Route");
		return new ResponseEntity(er,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
