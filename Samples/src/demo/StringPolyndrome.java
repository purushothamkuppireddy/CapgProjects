package demo;

import java.util.Scanner;

public class StringPolyndrome {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter");
//		int k=0;
//		 String str=sc.next();
//		 for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
//		 {
//		 if(str.charAt(i)!=str.charAt(j))
//			 k++;
//		 break;
//		 }
//		 
//		if(k>0)
//			System.out.println("not polyndrome");
//		else
//		System.out.println("polyndrome");
//	}
		
		
		//or

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String str = new String(sc.nextLine());
		StringBuilder str1 = new StringBuilder(str);
		System.out.println(str1);
//		StringBuilder str2 = new StringBuilder(str);
//		System.out.println(str1.toString().equals(str2.toString()));
		str1.reverse();
		System.out.println(str.equals( str1.toString()));

	}
}
