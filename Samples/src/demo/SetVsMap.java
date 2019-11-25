package demo;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetVsMap {

	public static void main(String[] args) {
		
		Set h2 = new LinkedHashSet<>();
		
		LinkedList l=new LinkedList();
		l.add(20);
		l.add(21);
		l.add(19);
		h2.add(6);  
		h2.add(123);  
		h2.add(111);  
		h2.add(1);
		h2.add(2);
		h2.add(3);
		h2.add(4);
		h2.add(5);
		
		ListIterator i=  l.listIterator();
		
		while(i.hasNext()) {
//			int num=i.next();
//			if(num==6) {
//				System.out.println(num);
//			}
//			System.out.println(i.next());
			

			i.next();
			
		}
		i.remove();
		
		System.out.println(l);
		System.out.println(h2);
	}

}
