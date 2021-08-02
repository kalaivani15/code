package examples;
import java.util.*;

public class TSet {

	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("ammu");
		t1.add("kuttyma");
		t1.add("yalu");
		t1.add("sri");
		System.out.println("list in set"+t1);
		for (String str : t1) {
			System.out.println(str);
			
		}
			
		

	}

}
