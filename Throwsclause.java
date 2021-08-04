package javaio;

class Throwsclause1 {
	public void method(int num)throws ArithmeticException , NullPointerException {
		if(num ==3) {
			throw new ArithmeticException("ArithmeticException occured");
		}
		else
			throw new NullPointerException("NullPointerException occured");
	
		}
}

		
	
public class Throwsclause{
	public static void main(String[] args) {
		try {
			Throwsclause1 obj = new Throwsclause1();
			obj.method(3); 
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}
}


