package demo;

import java.util.Set;
import java.util.TreeSet;

public class Anegram {

	public static void main(String[] args) {
		String s = "Silent";
		String s1=s.toLowerCase();
		String s2 = "listen";
		Set<Character> set1 = new TreeSet<>();
		// set1.add(s1);
		char ch1[] = s1.toCharArray();
		for (char c : ch1) {
			set1.add(c);
		}
		System.out.println(set1);
		Set<Character> set2 = new TreeSet<>();
		char ch2[] = s2.toCharArray();
		for (char c2 : ch2) {
			set2.add(c2);
		}
		
		System.out.println(set2);
		 
		 if(set1.equals(set2)) {
		 System.out.println("anegram");
		 }
		 else {
			 System.out.println("not anegram");
		 }

	}
}
