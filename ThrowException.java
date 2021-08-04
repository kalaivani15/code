package javaio;

public class ThrowException {
	static void method(int age){
		if(age <=18) {
			throw new ArithmeticException("not eligible for vote");
	}
	else {
		System.out.println("eligible for vote");
	}
	}

	public static void main(String[] args) {
		System.out.println("welcome for voting");
		method(14);
		
		
	

		

	}

}
	