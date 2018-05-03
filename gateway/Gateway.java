package gateway;
import java.util.ArrayList;

public class Gateway {
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

}
