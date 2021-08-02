package examples;
import java.util.*;

public class Sample {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(42);
		set.add(87);
		set.add(65);
		set.add(54);
		System.out.println(set);
		  //contain() method
		System.out.println(set.contains(87)); 
		   //isempty()
		System.out.println(set.isEmpty());
		  //size() method
		System.out.println(set.size());
		
		
		
		

	}

}
