package demo;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "hhelloh";
		int k = 0;
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					k++;

				}
				
			}
			
			if(k>1) {
				k=0;
			}
			if(k==1) {
				System.out.println(ch[i]);
				k=0;
				break;
			}
			
		}
		
	}

}
