
package main;

import helpers.Deserializer;
import helpers.Serializer;

/**
 * This class has several useful methods that can be used when handling objects!
 * @author Owen McNeil
 * @version 1.0, Last Updated: 02/07/16
 */
public class ObjectManager {
	
	/**
	 * Required constructor when creating an instance of this class. The constructor is private, use ObjectManager.Authorize to create an instance!
	 */
	private ObjectManager() {
		
	}
	
	public static ObjectManager Authorize(String passkey) {
		
		if (passkey.equals("ahdkajhdjadahsd723173128372183kdjasd@#^#&#*&#hjsdkshdady28")) {
			ObjectManager manager = new ObjectManager();
			return manager;
		} else {
			return null;
		}
	}
	

	/** 
	 * This method is used to save an object onto a specified file for later use! All object attributes are copied.
	 * @param object The object to be saved.
	 * @param saveLocation The location for the object to be saved, INCLUDING the file name and extension (.sv)
	 */
	public final void saveObject(Object object, String saveLocation) {
		Serializer serializer = new Serializer();
		serializer.serializeObject(object, saveLocation);
	}
	
	/**
	 * This method is used to open an object which was saved using this utility. All object attributes are loaded.
	 * @param saveLocation The location where the object is saved, INCLUDING the file name and extension (.sv)
	 * @return Returns the read object, or an error. (Hopefully the earlier)
	 */
	public final Object loadObject(String saveLocation) {
		Deserializer deserializer = new Deserializer();
		Object object = deserializer.deserialzeObject(saveLocation);
		return object;
	}
	
	
}
