package main;

public class OUtility {
	
	private OUtility() {
		
	}
	
	/**
	 * This method is required to create a new instance of the ObjectManager class.
	 * @param passkey The passkey that was (hopefully) given to you by Owen.
	 * @return If the passkey is correct, this method returns a new instance of the ObjectManager. Otherwise, it returns null.
	 */
	public static OUtility Authorize(String passkey) {
		
		if (passkey.equals("shaco op")) {
			OUtility utility = new OUtility();
			return utility;
		} else {
			return null;
		}
	}
	
	/**
	 * This method creates a new Object Manager, which can be used to manipulate objects in several different, useful ways!
	 * @return Returns a new instance of the OUtility ObjectManager class.
	 */
	public ObjectManager createObjectManager() {
		ObjectManager manager = ObjectManager.Authorize("ahdkajhdjadahsd723173128372183kdjasd@#^#&#*&#hjsdkshdady28");
		return manager;
	}

}
