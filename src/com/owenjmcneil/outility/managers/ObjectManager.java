
package com.owenjmcneil.outility.managers;

import java.io.FileNotFoundException;

import com.owenjmcneil.outility.helpers.Deserializer;
import com.owenjmcneil.outility.helpers.Serializer;

public class ObjectManager {

	/** 
	 * This method is used to save an object onto a specified file for later use! All object attributes are copied.
	 * Important: The object being saved must IMPLEMENT the Serializable class!
	 * @param object The object to be saved.
	 * @param saveLocation The location for the object to be saved, INCLUDING the file name and extension (.sv)
	 */
	public static void saveObject(Object object, String saveLocation) {
		Serializer serializer = new Serializer();
		serializer.serializeObject(object, saveLocation);
	}
	
	/**
	 * This method is used to open an object which was saved using this utility. All object attributes are loaded.
	 * @param saveLocation The location where the object is saved, INCLUDING the file name and extension.
	 * @return Returns the read object.
	 */
	public static Object loadObject(String saveLocation) {
		Deserializer deserializer = new Deserializer();
		Object object = deserializer.deserialzeObject(saveLocation);
		
		if (object == null) {
			Exception e = new Exception("OUtility: [ObjectManager]: Exception Caught! Object couldn't be found or couldn't be loaded.");
			e.printStackTrace();
		}
		
		return object;
	}
	
	/**
	 * Checks if a valid object exists in the specified file.
	 * @param saveLocation Location of the file you want to check
	 * @return Returns true if a valid object exists, false if not.
	 */
	public static boolean checkObjectExists(String saveLocation) {
		
		Deserializer deserializer = new Deserializer();
		
		Object object = deserializer.deserialzeObject(saveLocation);
		
		if (object != null) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
}
