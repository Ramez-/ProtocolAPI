package protocol;

import register.RegisterType;
import register.RegisterUnit;

public interface DLMSProtocol extends Protocol {
	// constants related to DLMS/COSEM only

	public static final String INSTANTANEOUS_POWER_ID = "1.1.16.7.0.255";
	public static final RegisterUnit INSTANTANEOUS_POWER_UNIT = RegisterUnit.W;
	public static final RegisterType INSTANTANEOUS_POWER_TYPE = RegisterType.Integer;

}
