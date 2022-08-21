
package com.mb.response;

import java.util.Date;
import java.util.List;

import com.mb.exception.ValidationErrorResponse;

public class ErrorResponse
{

	private String message;
	private int code;
	private boolean error;
	private List<ValidationErrorResponse> validationErros;

	public ErrorResponse(String message, int code, boolean error) {
		super();
		this.message = message;
		this.code = code;
		this.error = error;
	}

	public ErrorResponse() {
		super();
	}

	public void setValidationErros(List<ValidationErrorResponse> validationErros) {
		this.validationErros = validationErros;
	}

	public List<ValidationErrorResponse> getValidationErros() {
		return validationErros;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public boolean isError() {
		return error;
	}
}
