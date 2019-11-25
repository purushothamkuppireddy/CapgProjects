package capg;

public interface InterfaceOne {
	public void  register();
	 default void display1() {
		System.out.println("interfaceONE1");
	}
	 static void display2() {
			System.out.println("interfaceONE2");
		}
	
}

