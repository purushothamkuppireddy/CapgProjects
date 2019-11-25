package demo;

public class ThrowsExample {

	static void valid(int i) throws InvalidAgeException  
	{
		if(i<18)
			throw new InvalidAgeException("not eligible for vote  ");//custom exception(checked exception)
		else
			System.out.println("eligible for vote");
	}
	
	public static void main(String[] args) {
		
		try {
			valid(16);
		} catch (InvalidAgeException e) {
			
			System.out.println(e);
			e.printStackTrace();
			
		}
		
		System.out.println("testing complete");
	}

	



}
