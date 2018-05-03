package register;

import exceptions.ConnectionException;
import exceptions.MeterNotFoundException;
import meter.Meter;

public interface Register {

	public String getRegisterID();

	public RegisterType getRegisterType();

	public Unit getRegisterUnit();

	public void open() throws ConnectionException;

	public void close() throws ConnectionException;

	public RegisterValue read() throws ConnectionException;

	public Meter getMeter(String meterID) throws MeterNotFoundException;

}
