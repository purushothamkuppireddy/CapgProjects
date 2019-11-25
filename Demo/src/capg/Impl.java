package capg;

public class Impl implements InterfaceTwo {

	@Override
	public void register() {

		System.out.println("in register method");
	}

	@Override
	public void login() {

	}

	public static void main(String[] args) {
		InterfaceOne one = new Impl();
		one.display1();
		InterfaceOne.display2();
		InterfaceTwo two = new Impl();
		two.display();

	}

}
