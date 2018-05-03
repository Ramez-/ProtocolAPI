package exceptions;

public class InValidDataTypeException extends Throwable{

	public InValidDataTypeException(Exception e) {
		super(e.getMessage());
	}
}
