package capg;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	 String s;

	public void SetS(String s) {
		this.s = s;
	}

	// Demo(String s){
	//
	// this.s=s;
	// }
	void show() {
		System.out.println("i am in show method of super class");

	}
}

class Flavor1Demo {
	 Demo d3 = new Demo();
	Map<Integer, Demo> map = new HashMap<>();

	// An anonymous class with Demo as base class
	static Demo d = new Demo() {
		void show() {
			d.SetS("one");
			super.show();
			System.out.println("i am in Flavor1Demo class");
		}
	};

	public static void main(String[] args) {
//		Demo d = new Demo();
		d.SetS("two");
		Demo d2 = new Demo();
		d2.SetS("three");
		d.show();
		
		System.out.println(d.s);
		System.out.println(d2.s);
		new Flavor1Demo().display();

	}

	void display() {

		d3.SetS("3");
		map.put(1, d3);
		System.out.println(map.get(1).s);
		
		
		d3.SetS("4");
		map.put(2, d3);
		System.out.println(map.get(1).s);
		System.out.println(map.get(2).s);

	}
}
