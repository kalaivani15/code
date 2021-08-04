package javaio;

public class Multiplecatch {

	public static void main(String[] args) {
		int num1,num2;
		try {
		num1 = 0;
		num2 = 43/0;
		System.out.println("num2 is "+ num2);
		}
	     catch(ArithmeticException e){
	         System.out.println("Warning: ArithmeticException");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Warning: ArrayIndexOutOfBoundsException");
	      }
	      catch(Exception e){
	         System.out.println("Warning: Some Other exception");
	      }
	    System.out.println("Out of try-catch block...");	
		

	   
		

	}

}
