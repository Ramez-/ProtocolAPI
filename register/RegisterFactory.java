package register;

/*
 * This factory class only job is to create Registers on run time
 * 
 * maybe in run time user don't know whether to use virtual register or physical register
 * then he might need to check for the constant if it exist.
 */
public class RegisterFactory {

	public BaseRegister makeRegister(String newRegisterType, String registerID) {
		if (newRegisterType == "Virtual") {
			return new VirtualRegister(registerID);
		} else {
			if (newRegisterType == "PhysicalRegister") {
				return new PhysicalRegister(registerID);
			} else {
				return null;
			}
		}

	}
}
