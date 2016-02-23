
package main;

import helpers.Deserializer;
import helpers.Serializer;

public class ObjectManager {

	/** 
	 * This method is used to save an object onto a specified file for later use! All object attributes are copied.
	 * Important: The object being saved must IMPLEMENT the Serializable class!
	 * @param object The object to be saved.
	 * @param saveLocation The location for the object to be saved, INCLUDING the file name and extension (.sv)
	 */
	public final void saveObject(Object object, String saveLocation) {
		Serializer serializer = new Serializer();
		serializer.serializeObject(object, saveLocation);
	}
	
	/**
	 * This method is used to open an object which was saved using this utility. All object attributes are loaded.
	 * @param saveLocation The location where the object is saved, INCLUDING the file name and extension.
	 * @return Returns the read object.
	 */
	public final Object loadObject(String saveLocation) {
		Deserializer deserializer = new Deserializer();
		Object object = deserializer.deserialzeObject(saveLocation);
		return object;
	}
	
	
}
