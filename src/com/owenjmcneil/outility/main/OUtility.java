package com.owenjmcneil.outility.main;

import com.owenjmcneil.outility.managers.ObjectManager;

public class OUtility {
	
	/**
	 * This method creates a new Object Manager, which can be used to manipulate objects in several different, useful ways!
	 * @return Returns a new instance of the OUtility ObjectManager class.
	 */
	public ObjectManager createObjectManager() {
		ObjectManager manager = new ObjectManager();
		return manager;
	}

}
