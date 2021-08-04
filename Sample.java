package javaio;

public class Sample {

	public static void main(String[] args) {
		System.out.println(method()); 
	}
		public static int method() {
		
		try {
			return 15;  
		//statement in finally block execute first,even if try block contain return statement 
		}
		finally {
			System.out.println("this is finally block");
			System.out.println("return statement");
			
		}

	}

}
