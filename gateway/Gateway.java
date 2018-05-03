package gateway;

import java.util.ArrayList;

import exceptions.MeterNotFoundException;
import meter.Meter;
import protocol.Protocol;

public interface Gateway {

	public ArrayList<Meter> getAllMetersByProtocol(String protocol);

	public Meter getMeter(int meterID) throws MeterNotFoundException;

	public ArrayList<Meter> getAllMeters();

	public ArrayList<Protocol> getAllSupportedProtocols();

}
