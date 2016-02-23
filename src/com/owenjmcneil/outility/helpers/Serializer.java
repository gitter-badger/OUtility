package com.owenjmcneil.outility.helpers;


	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;

	public class Serializer {

		/**
		 * Classic serialize method. Used in the ObjectManager class.
		 * @param object Object to be saved
		 * @param saveLocation Where the object should be saved, including extension.
		 */
		 public void serializeObject(Object object, String saveLocation){
			   
			   try{
				   
				FileOutputStream fout = new FileOutputStream(saveLocation);
				ObjectOutputStream oos = new ObjectOutputStream(fout);   
				oos.writeObject(object);
				oos.close();
				   
			   }catch(Exception ex){
				   ex.printStackTrace();
			   }
		   }
		
	}


