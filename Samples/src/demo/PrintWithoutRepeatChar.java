package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrintWithoutRepeatChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Character> set=new TreeSet();
		System.out.println("give input");
		String str=sc.next();
	for(int i=0;i<str.length();i++)
		{
			
			set.add(str.charAt(i));
		}
			
			System.out.println(set);
			Iterator iter=set.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next());
			}
	}	
	
		
}
