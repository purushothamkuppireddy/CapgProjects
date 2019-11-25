package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserialisationEx {
static String path="C:\\Users\\pk44\\documents\\objectStream.txt";
	public static void main(String[] args)  {
		Employee emp = new Employee();
		emp.setEmpNo(103);
		emp.setName("pavan");
			
			try {
				FileOutputStream file = new FileOutputStream(path);
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(emp);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println("serialised");
		deserialise();
	}

	static void deserialise() {
		Employee emp=null;
		try {
			FileInputStream file=new FileInputStream(path);
			ObjectInputStream in =new ObjectInputStream(file);
			 emp=(Employee) in.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	emp.display();
	}
 
	
}
