package helpers;


	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;

	public class Serializer {

		
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


