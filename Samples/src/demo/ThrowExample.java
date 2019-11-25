package demo;

public class ThrowExample {
	
	static void valid(int i) {
		if(i<18)
			throw new ArithmeticException("not eligible for vote  ");
		else
			System.out.println("eligible for vote");
	}
	
	public static void main(String[] args) {
		try {
		valid(16);
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("testing complete");
	}

	

}
