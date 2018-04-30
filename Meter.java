import java.util.ArrayList;

import register.BaseRegister;

public class Meter {

	private ArrayList<BaseRegister> registersInMeter;
	private String manufacturer;
	private String protocolUsed;

	public Meter() {

	}

	public ArrayList<BaseRegister> getRegistersInMeter() {
		return registersInMeter;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getProtocolUsed() {
		return protocolUsed;
	}

	public BaseRegister getRegister(String registerID) {
		return null;
	}

}
