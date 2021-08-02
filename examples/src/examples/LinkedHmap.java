package examples;
import java.util.*;

import java.util.LinkedHashMap;

public class LinkedHmap {

	public static void main(String[] args) {
		LinkedHashMap <Integer,String> lhmap =new LinkedHashMap<Integer,String>();
        lhmap.put(22, "aa");
        lhmap.put(33, "bb");
        lhmap.put(1, "cc");
        lhmap.put(2, "dd");
        lhmap.put(100, "ee");	
  
       Set set  = lhmap.entrySet();
       Iterator iterator = set.iterator();
       while(iterator.hasNext()) {
    	   Map.Entry temp = (Map.Entry)iterator.next();
    	   System.out.println("key is " + temp.getKey()+ " and value is " + temp.getValue());
       }
	}
}

