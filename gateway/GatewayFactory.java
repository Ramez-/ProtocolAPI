package gateway;

import java.util.ArrayList;

import exceptions.GatewayNotFoundException;
import exceptions.MeterNotFoundException;
import meter.Meter;
import protocol.Protocol;

public interface GatewayFactory {

	public static Gateway create() {
		return new Gateway();
	}

	public static Gateway create(String gatewayID) throws GatewayNotFoundException {
		return new Gateway(gatewayID);
	}

	public ArrayList<Meter> getAllMetersByProtocol(String protocol);

	public Meter getMeter(int meterID) throws MeterNotFoundException;

	public ArrayList<Meter> getAllMeters();

	public ArrayList<Protocol> getAllSupportedProtocols();

}
