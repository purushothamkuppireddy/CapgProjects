package demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashVsTree {

	public static void main(String[] args) {
		TreeSet h2 = new TreeSet<>();
		h2.add(66666);
		 HashSet h = new HashSet<>();
		h.add(44);
		h.add(54);
//		h.add(null);
		h.add(64);
		h.add(44);
//		h.add("how");// can not be added in treeset
		h.add(9);
		h.add(80);
		h.add(77);
	
//		h.add(h2);// if h is treeset then java.util.HashSet cannot be cast to java.lang.Comparable
		h.addAll(h2);
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains(9));
		System.out.println(h.remove(44));
		System.out.println(h);
//		System.out.println(h.removeAll(h2));
		System.out.println(h.retainAll(h2));// retains all matching elements.i.e,[6666]
		System.out.println(h);
		h.clear();
		System.out.println(h);
		
//		Iterator<Integer> i=h.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}

		
		
//		HashMap<Integer,String> map=new HashMap<>();
////		TreeMap<Integer,String> map2=new TreeMap<>();
//	
//		map.put(101,"bob" );	
//		map.put(105,"jj" );	
//		map.put(105,"jh");
//		map.put(null,"bob" );
//		map.putIfAbsent(103, "kpr");
////		map.replace(101,"raju"); 
////		map.remove(105,"jh");//"value" is optional,if we don't use also it removes  both 105 key,similar to h.remove(105)
////		map.put(null,null);
//		System.out.println(map);
		

	}

}
