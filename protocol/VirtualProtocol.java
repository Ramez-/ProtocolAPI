package protocol;

import register.RegisterType;
import register.RegisterUnit;

// implementation of general protocol handling 
public interface VirtualProtocol extends Protocol {

	// OBIS standard constants will be here
	public static final String POSITIVE_ACTIVE_ENERGY_TOTAL_ID = "1.8.0";
	public static final RegisterUnit POSITIVE_ACTIVE_ENERGY_TOTAL_UNIT = RegisterUnit.kWh;
	public static final RegisterType POSITIVE_ACTIVE_ENERGY_TOTAL_TYPE = RegisterType.Double;

	public static final String POSITIVE_REACTIVE_ENERGY_TOTAL_ID = "3.8.0";
	public static final RegisterUnit POSITIVE_REACTIVE_ENERGY_TOTAL_UNIT = RegisterUnit.kvarh;
	public static final RegisterType POSITIVE_REACTIVE_ENERGY_TOTAL_TYPE = RegisterType.Double;
}
