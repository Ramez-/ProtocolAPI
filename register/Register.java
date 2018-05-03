package register;

import exceptions.ConnectionException;
import meter.Meter;

public interface Register {

	public String getRegisterID();

	public RegisterType getRegisterType();

	public RegisterUnit getRegisterUnit();

	public void open() throws ConnectionException;

	public void close() throws ConnectionException;

	public RegisterValue read() throws ConnectionException;

	public Meter getMeter();

}
