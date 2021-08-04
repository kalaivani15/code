package javaio;

public class TryCatchFinallyblock {

	public static void main(String[] args) {
	
		try {
			int num =45/5;
			System.out.println(num);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}
		finally {
			System.out.println("this is finally block");
			
			
		}

	}

}
