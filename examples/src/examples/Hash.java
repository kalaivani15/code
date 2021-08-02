package examples;
import java.util.*;

public class Hash {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("apple");
		hash.add("pineapple");
		hash.add("mango");
		System.out.println("elements in hash" +hash);
		hash.add(null);        // allow null character
		hash.add("mango");     //doesn't allow duplicate
		hash.add("papaya");
		System.out.println("now elements in hashset"+hash); 

		
	

	}

}
