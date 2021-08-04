package javaio;

public class Example {

	public static void main(String[] args) {
	      try{  
	    		 int num=121/11;  
	    		 System.out.println(num); 
	    		 System.exit(1);   
	    		 /* when System.exit() present in try block without
	    		  *  exception then finally block doesn't executed
	    		  */
	    	
	    	      }  
	    	      catch(ArithmeticException e){
	    	         System.out.println("Number should not be divided by zero");
	    	      }  
	    	     
	    	      finally{
	    		 System.out.println("This is finally block");
	    	      }  
	    	      System.out.println("Out of try-catch finally");  
	    	   }   
	    		
		

	}


