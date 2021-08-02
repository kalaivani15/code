package examples;
import java.util.*;

public class SubMap {

	public static void main(String[] args) {
		TreeMap<String,String> treemap = new TreeMap<String,String>();
	    treemap.put("Key1", "yellow");
	    treemap.put("Key2", "brown");
	    treemap.put("Key3", "pink");
	    treemap.put("Key4", "blue");
	    treemap.put("Key5", "white");
	    treemap.put("Key6", "red");
	    System.out.println("treemap contains: " +treemap );
	    
	    SortedMap<String, String> sortedMap = treemap.subMap("Key2","Key5");
	    System.out.println("sorted submap " + sortedMap);
	    
	   

	}

}
