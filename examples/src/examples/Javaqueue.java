package examples;
import java.util.*;

public class Javaqueue {

	public static void main(String[] args) {
	      Queue<String> q = new LinkedList<String>();
		    
	      q.add("Maggie"); 
	      q.add("Pasta");
	      q.add("Negan");
	      q.add("Athoo");
	      System.out.println("element in queue " +q);
	       //remove element
	      System.out.println("remove element " +q.remove("Negan"));
	      //poll
	      System.out.println("poll() " +q.poll());
	      //head
	      System.out.println("head " +q.element());
	      //peek
	      System.out.println("peek " +q.peek());
	      System.out.println("diplay the element " +q);
	      
	      	

	}

}
