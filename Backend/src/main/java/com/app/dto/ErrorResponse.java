package com.app.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ErrorResponse {
	
	private String message;
	private String errorDetails;
	private LocalDateTime time=LocalDateTime.now();
	
	public ErrorResponse() {
		super();
	}

	public ErrorResponse(String message, String errorDetails, LocalDateTime time) {
		super();
		this.message = message;
		this.errorDetails = errorDetails;
		this.time = time;
	}

	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", errorDetails=" + errorDetails + ", time=" + time + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public ErrorResponse(String message,String errorDetails) {
		this.message=message;
		this.errorDetails=errorDetails;
	}

}
