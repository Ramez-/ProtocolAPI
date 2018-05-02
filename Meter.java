import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import register.BaseRegister;

public class Meter {

	private ArrayList<BaseRegister> registersInMeter;
	private String manufacturer;
	private String protocolUsed;
	private int meterID;
	private static final AtomicInteger sequence = new AtomicInteger();

	public Meter() {
		setMeterID(sequence.incrementAndGet());
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

	public int getMeterID() {
		return meterID;
	}

	public void setMeterID(int meterID) {
		this.meterID = meterID;
	}

}
