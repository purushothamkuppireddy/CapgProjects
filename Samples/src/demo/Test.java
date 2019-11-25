package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Character[] vowels = { 'a', 'e', 'i', 'o', 'u', 'u' };
		Set<Character> vowelsSet = new HashSet<>(Arrays.asList(vowels));

		// or Set<Character> vowelsSet = new HashSet<>();
		// Collections.addAll(vowelsSet, vowels);

		// System.out.println(vowelsSet);
		// System.out.println(vowels);
		// System.out.println(Arrays.toString(vowels));

		String[] string = { "kdwe", "sf", "reddy" };
		// System.out.println(string);
		// System.out.println(Arrays.toString(string));// to display objects into string format within []

		String str = "purushotham reddy";
//		System.out.println(str.contains("uru"));
//		System.out.println(str.join("/","10","24","2019"));
		
//		String[] s = str.split("r");
		// System.out.println(str.split("r"));//it returns array object so we need toconvert array to string.
		// System.out.println(Arrays.toString(str.split("\\.")));

		String str2 = "word1, word2 word3@word4?word5.word6";
		String[] arrOfStr = str2.split("[, ?.@]+", -2);
//		System.out.println(Arrays.toString(arrOfStr));
		
		
		String s1="welcome";// string pool
		String s2=new String("welcome");//heap memory
		String s3=s2.intern();// converts heap memory to string pool
//		
//		 System.out.println(System.identityHashCode(s1));
//		 System.out.println(System.identityHashCode(s2));
//		 System.out.println(System.identityHashCode(s3));
//		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1.compareTo(s2));//  It compares values lexicographically(alphabetically) and returns an integer value >,<,=
//		System.out.println(s1.indexOf("el"));

	
		String sr=new String("very");
//		 sr="good";
		sr="very";
		String sr2="very";
		System.out.println(sr==sr2);//false
		
	}

}
