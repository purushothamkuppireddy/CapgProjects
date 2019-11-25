package demo;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	int roll;
	String name;	
	int age;
	Student(int roll,String name,int age){
		
		this.roll=roll;
		this.name=name;
		this.age=age;
		
		
	}
	public int compareTo(Student st)
	{
		System.out.println(age+" "+st.age);
		if(age==st.age) {
		System.out.println("hello");
		return 0;
		}
		else if(age>st.age)
			return 1;
		else
			return -1;
		
	}
}

class Sortstudents {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"viki",28));
		al.add(new Student(2,"sri",27));	
		al.add(new Student(3,"navi",26));	
		al.add(new Student(4,"vini",29));	
	Collections.sort(al);
	for(Student st:al)
	System.out.println(st.roll+"  "+st.name);
	
	}

}
