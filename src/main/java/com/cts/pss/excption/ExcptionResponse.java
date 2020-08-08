package com.cts.pss.excption;

import java.util.Date;

public class ExcptionResponse {
	
	private Date timestamp;
	private String message;
	private String Descrption;
	
	public ExcptionResponse(Date timestamp, String message, String descrption) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		Descrption = descrption;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescrption() {
		return Descrption;
	}

	public void setDescrption(String descrption) {
		Descrption = descrption;
	}
	
	

}
