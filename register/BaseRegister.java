package register;

import utils.RegisterType;
import utils.Unit;

public abstract class BaseRegister {

	private String registerID;
	// returned type by the register
	private RegisterType registerType;

	private Unit registerUnit;

	public BaseRegister(String registerID) {
		this.registerID = registerID;
	}

	public String getRegisterID() {
		return registerID;
	}

	public RegisterType getRegisterType() {
		return registerType;
	}

	public Unit getRegisterUnit() {
		return registerUnit;
	}

	// not sure do we need boundRegister if openRegister method is here were it
	// returns register type
	public abstract RegisterType openRegister();

}
