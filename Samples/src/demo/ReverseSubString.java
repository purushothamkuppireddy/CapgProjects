package demo;

public class ReverseSubString {

	static String s1;

	public static void main(String[] args) {

		String str = new String("Laxmi bindu");

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				s1 = str.substring(0, i);
				str=str.substring(i+1,str.length());
			}
		}
		System.out.println(str.concat(s1));
	}

	
}
