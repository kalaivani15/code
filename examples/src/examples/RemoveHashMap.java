package examples;
import java.util.*;

public class RemoveHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1,"cat");
		hmap.put(2,"dog");
		hmap.put(3,"rabbit");
		hmap.put(4,"parrot");
		System.out.println(hmap);	
		System.out.println("element removed is " +hmap.remove(4));
		System.out.println("after remove element hmap is" +hmap);

	}

}
