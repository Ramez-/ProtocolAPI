package exceptions;

public class MeterNotFoundException extends Throwable {

	public MeterNotFoundException(Exception e) {
		super(e.getMessage());
	}
}
