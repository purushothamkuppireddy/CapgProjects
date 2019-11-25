package demo;

public class GetCharactersFromString {
	public static void main(String args[]){  
		 String str = new String("hello javatpoint how r u");  
		      char[] ch = new char[10];  
		      try{  
		         str.getChars(7, 15, ch, 2);  
		         System.out.println(ch);  
		      }catch(Exception ex){System.out.println(ex);}  
		}
}
