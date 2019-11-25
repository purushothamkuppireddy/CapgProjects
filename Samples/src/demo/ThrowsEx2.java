package demo;

import java.io.IOException;

public class ThrowsEx2 {
	void msg() throws IOException{System.out.println("parent");}  
}

class TestExceptionChild extends ThrowsEx2{  
	  void msg()throws IOException{  
		 
	    System.out.println("TestExceptionChild");  
	    throw new ArithmeticException();
	  }  
	  public static void main(String args[]) throws ArithmeticException, IOException{  
		  ThrowsEx2 p=new TestExceptionChild();  
	  
		  p.msg(); 
	  
	   System.out.println("final");
	  }  
}
