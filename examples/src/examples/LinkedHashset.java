package examples;
import java.util.*;


public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("schoolbag");
		list.add("handbag");
		list.add("laptopbag");
		list.add("travelbag");
		System.out.println(list);
		for(String obj : list)
			System.out.println(obj);
	}

}
