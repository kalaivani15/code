package examples;
import java.util.*;
import java.util.Iterator;


public class HashSetIterator {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("kalai");
		set.add("vani");
		set.add("sundar");
		System.out.println("list of set"+set);
		Iterator<String> it = set.iterator();	//with iterator method
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
