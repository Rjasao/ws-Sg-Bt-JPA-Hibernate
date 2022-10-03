package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
<<<<<<< Updated upstream
		super("Resour cenot fould id " + id);
=======
		super("Resour ce not fould id" + id);
>>>>>>> Stashed changes
	}
}
