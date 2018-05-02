import java.util.ArrayList;

public class Gateway {

	private ArrayList<Meter> gatewayMeters;
	private String gatewayID;

	/*
	 * Two constructors when in case user need default gateway The other is for
	 * certain Gateway Using this way it means there is a configuration file for
	 * the gateways with the user
	 */
	public Gateway() {
		// return the default gateway from configuration file
		// fill the arraylist of meters using the configuration file
		// connect with the gateway
	}

	public Gateway(String gatewayID) {
		// search configuration file for gatewayID and create this gateway
		// fill the arraylist of meters using the configuration file
		// connect with the gateway
	}

	public ArrayList<Meter> getGatewayMeters() {
		return gatewayMeters;
	}

	public Meter getMeter(int meterID) {
		// search for the id name in the meters list
		return null;
	}
	
	public Meter getMeterByProtocol(String protocol){
		return null;
	}

}
