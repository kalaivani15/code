package examples;
import java.util.*;

public class loopHashMap {

	public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(4,"A");
		hmap.put(2,"K");
		hmap.put(3,"V");
		hmap.put(1,"I");
		hmap.put(5,"N");
	      //while + iterator
		System.out.println("while loop");
	    Iterator iterator = hmap.entrySet().iterator();
	    while(iterator.hasNext()) {
	         Map.Entry hs = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ hs.getKey() + " & Value is: ");
	         System.out.println(hs.getValue());
	       //for loop
	 
	      }
		
			
		}	
		
		
		

	}


