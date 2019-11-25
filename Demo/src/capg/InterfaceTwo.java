package capg;

public interface InterfaceTwo  extends InterfaceOne{
	public void  login();
	 default void display() {
		System.out.println("interfaceTWO");
		
	}
	
}
