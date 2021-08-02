package examples;
import java.util.*;

public class Containkey {

	public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(4,"A");
		hmap.put(2,"K");
		hmap.put(3,"V");
		hmap.put(1,"I");
		hmap.put(5,"N");	
		System.out.println(hmap);
		boolean temp =hmap.containsKey(3);      // for key
		System.out.println("if key 3 exist in map? " +temp);
		boolean obj =hmap.containsValue("k");
		System.out.println("if value 'k' exist in map? " +temp);
		
	}

}
