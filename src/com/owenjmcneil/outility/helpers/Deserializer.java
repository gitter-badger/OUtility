package com.owenjmcneil.outility.helpers;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
	
	 public Object deserialzeObject(String saveLocation){
		   
		   Object object;
		 
		   try{
			    
			   FileInputStream fin = new FileInputStream(saveLocation);
			   ObjectInputStream ois = new ObjectInputStream(fin);
			   object =  ois.readObject();
			   ois.close();
			  
			   return object;
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
			   return null;
		   } 
	   } 
}
