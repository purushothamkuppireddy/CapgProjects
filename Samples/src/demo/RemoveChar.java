package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveChar {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("give input");
			String str=sc.next();
//	str=str.replaceAll(Character.toString('l'),"");
System.out.println(str.replaceAll(Character.toString('l'),""));
		}
}
