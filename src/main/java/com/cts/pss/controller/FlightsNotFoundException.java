package com.cts.pss.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightsNotFoundException extends RuntimeException {

	public FlightsNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
