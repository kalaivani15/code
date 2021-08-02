package examples;
import java.util.*;

public class KeyValues {

	public static void main(String[] args) {
		   Hashtable<String, String> hashtable = new Hashtable<String, String>();
		   
		   hashtable.put("A", "Apple");
		   hashtable.put("B", "Orange");
		   hashtable.put("C", "Mango");
		   hashtable.put("D", "Banana");
		   hashtable.put("E", "Grapes");	
		   boolean key1 = hashtable.containsKey("A");
		   System.out.println("Key A exists in Hashtable?: " + key1);
		   boolean Value1 = hashtable.containsKey("Mango");
		   System.out.println("Key A exists in Hashtable?: " + Value1);

	}

}
