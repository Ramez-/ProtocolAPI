package exceptions;

public class VirtualRegisterNotFoundException extends Exception {

	public VirtualRegisterNotFoundException(Exception e) {
		super(e.getMessage());
	}

}
