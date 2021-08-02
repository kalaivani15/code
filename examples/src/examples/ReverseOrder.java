package examples;
import java.util.*;

public class ReverseOrder {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
	      tmap.put(1, "Data1");
	      tmap.put(23, "Data2");
	      tmap.put(70, "Data3");
	      tmap.put(4, "Data4");
	      tmap.put(2, "Data5");	
	      new TreeMap<Integer,String> (Collections.reverseOrder());
	      for(Map.Entry tm : tmap.entrySet()) {
	    	  System.out.println("key " + tm.getKey() +" and value " + tm.getValue());
	      }
	    
	    	  
	}

}
