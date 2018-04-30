package utils;

/*
 * Type returned by the registers
 */
public class RegisterType {
	String returnedString;

	// not primitive as int because you can't compare int to null because the
	// default of int is zero
	Integer returnedInt;
	Double returnedDouble;

	public RegisterType(String returnedString) {
		this.returnedString = returnedString;
	}

	public RegisterType(int returnedInt) {
		this.returnedInt = returnedInt;
	}

	public RegisterType(double returnedDouble) {
		this.returnedDouble = returnedDouble;
	}

	/*
	 * return the type that the register use as string
	 */
	public String getType() {
		if (returnedString != null) {
			return "String";
		} else {
			if (returnedInt != null) {
				return "Integer";
			} else {
				return "Double";
			}
		}
	}
}
