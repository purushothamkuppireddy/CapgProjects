package demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrListVsLinkedList {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		LinkedList ll=new LinkedList();
		al.add("hi");
		al.add(123);
		ll.add("jjj");
		ll.add(12423);
		ll.addFirst(12.0);
	System.out.println(al+" "+ ll);
	System.out.println(ll.getFirst());
	}

}
