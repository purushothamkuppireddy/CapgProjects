package capg;
@FunctionalInterface
public interface Interface3 {
	public void register();
		default void display1() {
		System.out.println("display1");
	}

	default void display2() {
		System.out.println("display2");
	}

}

class Test {
	public static void main(String[] args) {
		//by lambda expression
		Interface3 i = () -> System.out.println("register");
		i.register();
		i.display1();

		// following is done by using annonymous inner class
		Interface3 r = new Interface3() {
			public void register() {
				System.out.println("register");
			}};
		
		r.register();
		r.display1();
	}
}
