package examples;
import java.util.*;
import java.io.*;

public class DeserializeHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map =null;
		try {
			FileInputStream fis = new FileInputStream("hmap.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			map = (HashMap)ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe)
	    {
	         ioe.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Class not found");
	         c.printStackTrace();
	         return;
	        
	      }	
		System.out.println("deserialized hashmap");
		for(Map.Entry hs : map.entrySet()) {
			System.out.println("key " +hs.getKey() +"& value is" +hs.getValue());
		
		
			
					
		}
		

	}

}
