package examples;
import java.util.*;

public class SetofKey {

	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<String, String>();
	    hmap.put("Key1", "ram");
	    hmap.put("Key2", "sam");
	    hmap.put("Key3", "mani");
	    hmap.put("Key4", "guru");
	    hmap.put("Key5", "charu");
	    System.out.println(hmap);
	    Set <String> keys =hmap.keySet();
	    System.out.println("set of key" +keys);
		
		
		
	}
		
	
	 
	 
	   
}
