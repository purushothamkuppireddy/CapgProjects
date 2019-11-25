package demo;

import java.util.Scanner;

public class CustomException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if (age > 19) {
			System.out.println("valid age");

		} else
			try {
				throw new InvalidAgeException("INVALID");
			} catch (InvalidAgeException e) {

				e.printStackTrace();
			}
		System.out.println("hhh");
	}

}
