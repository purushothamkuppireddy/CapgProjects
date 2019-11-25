package demo;

public class InvalidAgeException extends Exception {
	
public InvalidAgeException(String s) {
	
	super(s);
	System.out.println("age is not suffiecient");
	
}
}
