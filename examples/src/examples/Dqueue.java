package examples;
import java.util.*;

public class Dqueue {

	public static void main(String[] args) {
	       Deque<String> dq = new ArrayDeque<String>();
		    
		   dq.add("red");
		   dq.add("blue");
		   dq.addLast("violet");
		   dq.addFirst("gray");
		   dq.add("ash");	
		   System.out.println("deque" +dq);
		   System.out.println("poll(): "+dq.pollLast());
		
	}

}
