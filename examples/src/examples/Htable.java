package examples;
import java.util.*;

public class Htable {

	public static void main(String[] args) {
		
		Enumeration names;
		String key;
		Hashtable<String,String> ht = new Hashtable<String,String>();
		   ht.put("Key1","kalai");
		   ht.put("Key2","viji");
		   ht.put("Key3","priya");
		   ht.put("Key4","uma");
		   ht.put("Key5","raji");
		   names = ht.keys();
		   while(names.hasMoreElements()) {
			   key=(String)names.nextElement();
		   System.out.println("key " +key+ " and values " + ht.get(key));
		   }
			   
	

	}

}
