package examples;
import java.util.*;

public class PutAll {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1,"cat");
		hmap.put(2,"dog");
		hmap.put(3,"rabbit");
		hmap.put(4,"parrot");	
		System.out.println("hmap is" +hmap);
		HashMap<Integer,String> hmap1 = new HashMap<Integer,String>();
		hmap1.put(6, null);
	    hmap1.putAll(hmap);
	    System.out.println("hmap1 is "+hmap1);
		
		

	}

}
