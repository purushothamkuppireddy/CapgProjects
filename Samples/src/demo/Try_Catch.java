package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Try_Catch {

	public static void main(String[] args) {

		int i = 10;
		try {
			i = i / 2;
			i = i / Integer.parseInt(args[0]);
		} 
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();// Name of Exception: description and Location at stack
//			System.out.println(e);
//			System.out.println(e.toString());// Name of Exception: description
//			System.out.println(e.getMessage());// only description .../by zero
		}
		finally{
			System.out.println("finally block");
			System.out.println("value i: " + i);

		}

		
	}

}
