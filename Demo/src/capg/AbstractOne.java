package capg;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract  class AbstractOne{
	public abstract  void show1();
	public void display() {
	System.out.println("AbstractOne");	
	}
	public static void main(String[] args) {
		new Impl2().show1();
		
		
	}
	
}