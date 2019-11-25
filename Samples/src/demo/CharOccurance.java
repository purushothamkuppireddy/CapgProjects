package demo;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "helloaeh";
//1	
		 //LinkedHashMap maintains insertion order.
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char[] ch = str.toCharArray();

		
		for (char c : ch) {
			
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);

			}

		}

		for (Map.Entry m : map.entrySet()) {
			 if(m.getValue().equals(1)) // to get keys and values without repeating we use this line
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
//2	
		/*
		// if we use HashMap instead of LinkedHashmap ,doesn't maintain order.so going through string again
		for (int i = 0; i < str.length(); i++) { 
				char c = str.charAt(i); 
				if (map.get(c) == 1) { 
					System.out.println(c); 
				} 
				}*/

			
//3		
		
		/*Set<Character> repeating = new HashSet<>();
		ArrayList nonRepeating = new ArrayList<>();//"helloaeh"
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (repeating.contains(letter))
			{
				continue; 
				}
			if (nonRepeating.contains(letter)) 
			{ 
				nonRepeating.remove((Character) letter); 
				repeating.add(letter); } //leh
			else { 
				nonRepeating.add(letter); //oa
				} 
			}
		System.out.println(nonRepeating.get(0));*/
		
	}
}
