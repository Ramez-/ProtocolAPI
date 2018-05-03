package meter;

import java.util.ArrayList;

import exceptions.RegisterNotFoundException;
import protocol.Protocol;
import register.Register;

public interface Meter {

	public ArrayList<Register> getAllRegisters();

	public String getManufacturer();

	public Protocol getProtocol();

	public Register getRegister(String registerID) throws RegisterNotFoundException;

	public String getMeterID();

	public boolean hasRegister(String registerID);

}
