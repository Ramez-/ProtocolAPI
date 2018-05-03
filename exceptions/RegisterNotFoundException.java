package exceptions;

public class RegisterNotFoundException extends Exception {

	public RegisterNotFoundException(Exception e) {
		super(e.getMessage());
	}

}
