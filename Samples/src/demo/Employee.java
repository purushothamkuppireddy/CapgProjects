package demo;

import java.io.Serializable;

public class Employee implements Serializable{
	
	
	
	String name;
	int empNo;
	
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
public Employee(){}

	public Employee(String name, int empNo) {
		super();
		this.name = name;
		this.empNo = empNo;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("raju", 101);
		Employee e2 = new Employee("ajay", 102);
e1.display();
e2.display();

	}

	void display(){
	System.out.println(this.name+" "+this.empNo);
	
}
	
}
