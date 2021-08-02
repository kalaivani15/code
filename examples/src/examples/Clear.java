package examples;
import java.util.*;

public class Clear {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("item1");
		hset.add("item2");
		hset.add("item3");
		hset.add("item4");
		System.out.println("elements in hset before remove" +hset);
		hset.clear();
		System.out.println("elements in hset afeter clear" +hset);
		
		

	}

}
