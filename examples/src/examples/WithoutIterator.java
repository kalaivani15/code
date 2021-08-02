package examples;
import java.util.*;

public class WithoutIterator {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("apple");
		hash.add("pineapple");
		hash.add("mango");
		System.out.println("elements in hash" +hash);	
		System.out.println("iterate of elements");
		for(String str : hash){
		System.out.println(str);
		}

	}

}
